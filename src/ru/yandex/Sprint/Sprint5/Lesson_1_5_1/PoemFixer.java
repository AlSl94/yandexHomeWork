package ru.yandex.Sprint.Sprint5.Lesson_1_5_1;

public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder builderPoem = new StringBuilder();// допишите код

        for (int i = 0; i < poem.length; i++) {
            if (!poem[i].isEmpty() || !poem[i].isBlank()) {
                builderPoem.append(poem[i].trim());
                builderPoem.append(" ");
            }
        }
        String fixed = builderPoem.toString();
        return fixed;
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
