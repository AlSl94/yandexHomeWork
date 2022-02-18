package ru.yandex.caloriesCount;
import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in); // Метод сканера
    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>(); // Хеш-таблица: Ключ = номер месяц
                                        // Значение = метод MonthData, в которой лежит еще одна таблица.
    int stepGoal = 10000;

    public StepTracker() {
        for (int i = 1; i <= 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    class MonthData {
        М
    }

    public void newStepGoal() { // Метод по определению целевого количества шагов
        System.out.println("Введите желаемое количество шагов: ");
        int newSteps = scanner.nextInt();
        stepGoal = newSteps;
        System.out.println("Новая цель шагов в день: " + stepGoal);
    }
}