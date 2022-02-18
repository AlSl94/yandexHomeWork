package ru.yandex.expensesManager;
import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }
    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рубляках: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашему счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }
    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }
    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }
    Double getExpenseSum() {
        double expensesSum = 0;
        for (String name : expensesByCategories.keySet()) {
            ArrayList<Double> expenses = expensesByCategories.get(name);
            for (double expense : expenses) {
                expensesSum = expensesSum + expense;
            }
        }
        return expensesSum;
    }
    void removeCategory(String name) {
        expensesByCategories.remove(name);
    }

    String getMaxCategoryName() {

        double maxCategorySum = 0;
        String maxCategoryName = "";

        for (String category : expensesByCategories.keySet()) {
            ArrayList<Double> categorySum = expensesByCategories.get(category);
            double sum = 0;
            for (Double expense : categorySum) {
                sum += expense;
            } if (maxCategorySum < sum) {
                maxCategorySum = sum;
                maxCategoryName = category;
            }
        }
        return maxCategoryName;
    }
}
