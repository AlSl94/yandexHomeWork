package ru.yandex.Sprint.Sprint5.Lesson_1_3_2;

public class Capitalizator {
    public String capitalize(String str) {
        String fix = str.substring(1);
        String upper = str.substring(0, 1).toUpperCase();
        return upper + fix;
    }
}