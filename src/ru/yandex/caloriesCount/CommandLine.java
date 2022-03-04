package ru.yandex.caloriesCount;

import java.util.Scanner;

public class CommandLine {

    Scanner scanner = new Scanner(System.in); // Метод сканера

    public void handleCommands(StepTracker stepTracker) {
        stepTracker.blankData();
        while (true) {
            printMenu();
            String command = scanner.next();
            switch (command) {
                case "0":
                    System.out.println("Пока-пока!");
                    return;
                case "1":
                    stepTracker.addNewDay();
                    break;
                case "2":
                    stepTracker.monthStats();
                    break;
                case "3":
                    stepTracker.newStepGoal();
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Выберите нужную команду: ");
        System.out.println("1 - Ввести количество шагов за определенынй день");
        System.out.println("2 - Напечатать статистику за определенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}
