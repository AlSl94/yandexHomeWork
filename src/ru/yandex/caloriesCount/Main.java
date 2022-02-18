package ru.yandex.caloriesCount;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Метод сканера
        Converter converter = new Converter(); // Метод конвертации шагов в километры и калории
        StepTracker stepTracker = new StepTracker(); // Метод с основной логикой программы


        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Укажите месяц:");
                String month = scanner.next();
                System.out.println("Укажите день:");
                Integer day = scanner.nextInt();
                System.out.println("Укажите количество шагов:");
                Integer steps = scanner.nextInt();
            } else if (command == 2) {
            } else if (command == 3) {
                stepTracker.newStepGoal();
            }
        }
    }
     private static void printMenu() {
        System.out.println("Выберите нужную команду: ");
        System.out.println("1 - Ввести количество шагов за определенынй день");
        System.out.println("2 - Напечатать статистику за определенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения");
    } // Вызываем консольное меню
}
