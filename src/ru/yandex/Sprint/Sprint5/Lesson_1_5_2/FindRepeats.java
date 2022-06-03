package ru.yandex.Sprint.Sprint5.Lesson_1_5_2;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        StringBuilder tb = new StringBuilder(text);
        int count = 0;
        while (tb.indexOf(substring, 0) != -1) {
            count++;
            tb.delete(0, tb.indexOf(substring) + substring.length());
        }
        return count;
    }

    public static void main(String[] args) {
        FindRepeats fr = new FindRepeats();
        System.out.println(fr.numberOfRepeats("раз раз раз два раз раз", "раз"));
    }
}

