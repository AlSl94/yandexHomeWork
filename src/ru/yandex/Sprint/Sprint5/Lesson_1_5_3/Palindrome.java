package ru.yandex.Sprint.Sprint5.Lesson_1_5_3;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();

        if (str.equals(String.valueOf(reverse))) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeWord("комок"));
    }
}
