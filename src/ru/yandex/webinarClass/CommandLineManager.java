package ru.yandex.webinarClass;

import java.util.Scanner;

public class CommandLineManager {
    Scanner scanner = new Scanner(System.in);

    public CommandLineManager() {
    }

    public void printMenuAndHandleCommand(Journal journal) {
        while (true) {
            printMenu();
            int input = scanner.nextInt();
            if (input == 1) {
                readPupilAndAdd(journal);
            } else if (input == 2) {
                journal.printAvgMarks();
            } else if (input == 3) {
                journal.printPupilsWithExcellentMarksPercent();
            } else if (input == 0) {
                System.out.println("Пока!");
                return;
            }
        }
    }

    private void readPupilAndAdd(Journal journal) {
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите оценку за математику");
        int mathMark = scanner.nextInt();
        System.out.println("Введите оценку за русский язык");
        int russianMark = scanner.nextInt();
        System.out.println("Введите оценку за физику");
        int physicsMark = scanner.nextInt();
        journal.pupils.add(new Pupil(name, mathMark, russianMark, physicsMark));
        System.out.println("Ученик: " + "\n" + name + ": " + mathMark + " " + russianMark + " " + physicsMark);
    }

    static void printMenu() {
        System.out.println("Введите комманду:");
        System.out.println("1: Добавить ученика");
        System.out.println("2: Средний балл среди всех учеников");
        System.out.println("3: Вывести процент отличников");
        System.out.println("0: Выход");
    }
}
