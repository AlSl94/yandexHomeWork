package ru.yandex.expensesManager;
import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5,88.7,0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? " +
                        "Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                System.out.println("К какой категории относится трата?");
                String category = scanner.next();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, category, expense);
            } else if (command == 4) {
                expensesManager.printAllExpensesByCategories();
            } else if (command == 5) {
                System.out.println("В какой категории искать ");
                String category = scanner.next();
                System.out.println("Самая большая трата в категории " + category +
                        " составила " + expensesManager.findMaxExpenseInCategory(category) + " руб.");
            } else if (command == 6) {
                expensesManager.removeAllExpenses();
            } else if (command == 7) {
                System.out.println("Всего потрачено: " + expensesManager.getExpenseSum());
            } else if (command == 8) {
                System.out.println("Какую категорию вы хотите удалить?");
                String category = scanner.next();
                expensesManager.removeCategory(category);
            } else if (command == 9) {
                System.out.println("В категории " + expensesManager.getMaxCategoryName()
                        + " вы потратили больше всего");
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        } // Конец While
    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать трат по категориям");
        System.out.println("5 - Показать самую большую трату в выбранной категории");
        System.out.println("6 - Очистить таблицу трат");
        System.out.println("7 - Вернуть сумму всех трат");
        System.out.println("8 - Удалить категорию");
        System.out.println("9 - Получить имя самой дорогой категории");
        System.out.println("0 - Выход");
    }
}
