package ru.yandex.Sprint.Sprint6.Lesson_1_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practicum {

    public static Optional<String> find(String text, List<Optional<String>> maybeWords) {
        String[] words = text.toLowerCase().split("\\P{IsAlphabetic}+"); // разбиение на слова
        for (int start = 0; start <= words.length - maybeWords.size(); start++) {
            boolean noMatch = false;
            for (int i = 0; i < maybeWords.size(); i++) {
                Optional<String> maybeWord = maybeWords.get(i);
                if (maybeWord.isPresent() && !maybeWord.get().equals(words[start + i])) {
                    noMatch = true;
                    break;
                }
            }
            if(!noMatch){
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < maybeWords.size(); i++) {
                    stringBuilder.append(words[start + i]).append(" ");
                }
                return Optional.of(stringBuilder.toString().strip());
            }
        }
        return Optional.empty();
    }

    public static void findInBooks(List<String> books, List<Optional<String>> maybeWords) {
        //напишите стримы поиска фрагмета и вывода результата
        for (String text : books) {
            find(text, maybeWords).ifPresent(System.out::println);
        }
    }

    public static void main(String[] args) {
        List<String> books = Arrays.asList(
                "Фараон желает доброе утро! Доброе утро всем читающим эти строки!",
                "Солнце печёт людей; бабушка печёт пирожки; печь греет дом",
                "Наскальная живопись может приглянуться всем, особенно может всем запомниться"
        );

        findInBooks(books, List.of(Optional.of("доброе"), Optional.empty(), Optional.of("всем")));
        // "доброе утро всем"
        findInBooks(books, List.of(Optional.of("доброе"), Optional.empty(), Optional.empty(), Optional.of("всем")));
        // empty
       findInBooks(books, List.of(Optional.empty(), Optional.of("печёт"), Optional.of("пирожки")));
        // "бабушка печёт пирожки"
       findInBooks(books, List.of(Optional.of("может"), Optional.of("всем"), Optional.empty()));
        // "может всем запомниться"
    }
}