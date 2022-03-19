package ru.yandex.secondSprint.Lesson10_3_2;

public class BedAndBreakfast {
    private int capacity = 10;
    private boolean full = false;

    void book() {
        if (!full) {
            System.out.println("Забронирован еще один номер!");
            capacity = capacity - 1;
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    void free() {
        if (capacity < 10) {
            capacity = capacity + 1;
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    boolean isFull() {
        return full;
    }
}
