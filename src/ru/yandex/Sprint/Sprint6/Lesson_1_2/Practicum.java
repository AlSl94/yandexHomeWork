package ru.yandex.Sprint.Sprint6.Lesson_1_2;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Practicum {


    public static void main(String[] args) {
        FilteredSaver saver = new FilteredSaver();
        saver.setOnSaveListener(new Consumer<String>() {
            @Override
            public void accept(String line) {
                System.out.println("СОХРАНЕНО: " + line);
            }
        });
        saver.addFilter(new Predicate<String>() {
            @Override
            public boolean test(String line) {
                return line.contains("ВАЖНО");
            }
        });
        saver.addFilter(new Predicate<String>() {
            @Override
            public boolean test(String line) {
                return line.endsWith("!");
            }
        });

        saver.save("Привет!");  // не сохранится
        saver.save("ВАЖНО - это важное слово"); // не сохранится
        saver.save("ВАЖНО! Не забывай его использовать для заметок!"); // сохранится и выведется на экран
        saver.save("Но и память тренировать тоже очень ВАЖНО!");    // сохранится и выведется на экран
        System.out.println(saver.getSaved());   // список из двух сохранённых сообщений
    }
}