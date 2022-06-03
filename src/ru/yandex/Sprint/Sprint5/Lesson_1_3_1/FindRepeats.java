package ru.yandex.Sprint.Sprint5.Lesson_1_3_1;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            int index = text.indexOf(substring) + substring.length();
            text = text.substring(index);
            count++;
        }
        return count;
    }
}