package ru.yandex.accounting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = new FileReader();
        MonthlyReport mReport = new MonthlyReport();
        while (true) {
            printMenu();
            String input = scanner.next();
            switch (input) {
                case "0":
                    System.out.println("Всего доброго!");
                    return;
                case "1":
                    mReport.splitMonthLines();
                    break;
                case "2":
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1: Считать все месячные отчеты");
        System.out.println("2: Считать годовой отчет");
        System.out.println("3: Сверить отчеты");
        System.out.println("4: Вывести информацию о всех месячных отчетах");
        System.out.println("5: Вывести информацию о годовом отчете");
        System.out.println("0: Выход");
    }
}
