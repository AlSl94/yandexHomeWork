package ru.yandex.Sprint.Sprint5.Lesson_1_5_4;

public class Palindrome {

    public boolean isPalindromeLine(String str) {
        StringBuilder sb = new StringBuilder(str.toLowerCase());

        int j = 0;
        for(int i = 0; i < sb.length(); i++) {
            if (!Character.isWhitespace(sb.charAt(i))) {
                sb.setCharAt(j++, sb.charAt(i));
            }
        }
        sb.delete(j, sb.length());

        String noSpaces = sb.toString();
        StringBuilder reverse = sb.reverse();

        if (noSpaces.equals(String.valueOf(reverse))) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeLine("Молебен о коне белом"));
    }
}