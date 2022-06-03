package ru.yandex.Sprint.Sprint2.Lesson11_2;

public class Main {
    public static void main(String[] args) {
        Song theRockBandSong = new Song("Popular Song", "The Rock Band", "John Doe");
        Song johnDoeSong = new Song("Popular Song", "The Rock Band", "John Doe");
        Song rapSong = new Song("A song about a hard life", "Popular Rapper", "Popular Rapper");
        Song richardRoeSong = new Song("A song about a hard life", "Popular Rapper", "Richard Roe");

        boolean check0 = false; // Правило рефлексивности, объект равен сам себе
        if (johnDoeSong.equals(johnDoeSong)) {
            check0 = true;
        }
        boolean check1 = false; // Правило симметричности, от перестановки мест слагаемых сумма не изменяется
        if (theRockBandSong.equals(johnDoeSong) && johnDoeSong.equals((Object) theRockBandSong)) {
            check1 = true;
        }
        boolean check2 = false; // Проверяем на неравенство объекту другого класса
        if (!rapSong.equals(42)) {
            check2 = true;
        }
        boolean check3 = false; // ** "На ноль делить нельзя" - Проверяем на неравенство пустой ссылке
        if(!theRockBandSong.equals(null)) {
            check3 = true;
        }
        boolean check4 = true; // Проверяем на правильное сравнение объектов одного класса
        if(richardRoeSong.equals(johnDoeSong)) {
            check4 = false;
        }
        boolean check5 = false; // Правило транзитивности, если 1 = 2, а 2 = 3, то 1 = 3
        Song popularSong = new Song("Popular Song", "The Rock Band", "John Doe");
        if (popularSong.equals(theRockBandSong) && theRockBandSong.equals(johnDoeSong)
                && popularSong.equals(johnDoeSong)) {
            check5 = true;
        }
        boolean check6 = true; // Проверяем согласованность, множественный вызов x.equals(y) даёт один и тот же результат
        boolean result = rapSong.equals(richardRoeSong);
        for (int i = 0; i < 10; i++) {
            if (rapSong.equals(richardRoeSong) != result) {
                check6 = false;
            }
        }

        if (check0 && check1 && check2 && check3
                && check4 && check5 && check6) {
            System.out.println("Поздравляем! Метод equals реализован верно.");
        } else {
            System.out.println("Что-то здесь не так. Подумайте над реализацией еще немного.");
        }
    }
}
