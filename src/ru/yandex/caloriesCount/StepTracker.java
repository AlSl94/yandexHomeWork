package ru.yandex.caloriesCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in); // Метод сканера
    Converter converter = new Converter();
    ArrayList<MonthData> dayAndSteps = new ArrayList<>();
    HashMap<Integer, ArrayList<MonthData>> monthToData = new HashMap<>(); // Хеш-таблица: Ключ = номер месяц
                                                    // Значение = метод MonthData, в которой лежит еще одна таблица.
    int stepGoal = 10000;

    public void addNewDay() { // Добавляет месяц, день и количество шагов в hashmap
        int month = 0;
        int day = 0; // Здесь возникает ошибка, как раньше в методе handleCommands, если ввести не цифру, а букву
        System.out.println("Укажите месяц:"); // Я ковырялся, пытался сделать еще одну переменную String stringMonth
        int newMonth = scanner.nextInt(); // Которую передавал в newMonth через castToInt, но ошибка возникает энивей
        if (newMonth < 0 || newMonth > 12) { // Поэтому я просто оставил, все как есть. Пока что вообще нет идей
            System.out.println("Введите месяц от 1 до 12"); // Как такое исправить. Но будет о чем подумать..
        } else {
            month = newMonth;
            System.out.println("Укажите день (1-30):");
            int newDay = scanner.nextInt();
            if (newDay < 0 || newDay > 30) {
                System.out.println("Введите день от 1 до 30");
            } else {
                day = newDay;
                System.out.println("Укажите количество шагов:");
                int newSteps = scanner.nextInt();
                dayAndSteps.add(new MonthData(day, newSteps));
                monthToData.put(month, dayAndSteps);
            }
        }
    }

    public void monthStats() {
        System.out.println("Введите желаемый месяц: ");
        int input = scanner.nextInt();
        getStepsForEveryDay(input);
        System.out.println("Общее количество шагов за месяц: " + sumOfStepsInMonth(input));
        System.out.println("Максимальное пройденное количество шагов в месяце: " + maxStepsInMonth(input));
        System.out.println("Среднее количество шагов: " + avgStepsInMonth(input));
        System.out.println("Пройденная дистанция: " + stepsIntoKm(input) + "км");
        System.out.println("Количество сожжённых килокалорий: " + burnedCalories(input));
        System.out.println("Лучшая серия: " + longestStreakOfGoalSteps(input));
    }

    public void blankData() { // Такое простое и очевидное решение, сам я и не подумал, что можно сделать так просто :\
        for (Integer month = 1; month <= 12; month++) {
            ArrayList<MonthData> monthData = new ArrayList<>();
            for (Integer day = 1; day <= 30; day++) {
                monthData.add(new MonthData(day, 0));
            }
            monthToData.put(month, monthData);
        }
    }

    public void getStepsForEveryDay(int exactMonth) { // Шаги за каждый день в месяце
        ArrayList<MonthData> stepsForEveryDayInMonth = monthToData.get(exactMonth);
        for(MonthData steps : stepsForEveryDayInMonth) {
            System.out.print(steps.day + " день: " + steps.steps + ", ");
        }
        System.out.println();
    }

    public int sumOfStepsInMonth(int exactMonth) { // Сумма шагов в выбранном месяце
        int sumOfSteps = 0;
            ArrayList<MonthData> listOfSteps = monthToData.get(exactMonth);
            for (MonthData steps : listOfSteps) {
                sumOfSteps = sumOfSteps + steps.steps;
            }
            return sumOfSteps;
    }

    public int maxStepsInMonth(int exactMonth) { // Максимальное количество шагов в месяце
        int maxSteps = 0;
        ArrayList<MonthData> listOfSteps = monthToData.get(exactMonth);
        for (MonthData steps : listOfSteps) {
            if (maxSteps < steps.steps) {
                maxSteps = steps.steps;
            }
        }
        return maxSteps;
    }

    public float avgStepsInMonth(int exactMonth) { // Среднее количество шагов за месяц
        int sumOfSteps = 0;
        int sumOfDays = 0;
        ArrayList<MonthData> listOfSteps = monthToData.get(exactMonth);
        for (MonthData steps : listOfSteps) {
            sumOfSteps = sumOfSteps + steps.steps;
            sumOfDays = sumOfDays + 1;
        }
        float avgOfSteps = (float) sumOfSteps / sumOfDays;
        return avgOfSteps;
    }

    public double stepsIntoKm(int exactMonth) { // Пройденная дистанция за километр
        int sumOfSteps = 0;
        ArrayList<MonthData> listOfSteps = monthToData.get(exactMonth);
        for (MonthData steps : listOfSteps) {
            sumOfSteps = sumOfSteps + steps.steps;
        }
        double distance = converter.convertDistance(sumOfSteps);
        return distance;
    }

    public double burnedCalories(int exactMonth) { // Количество сожженых калорий
        int sumOfSteps = 0;
        ArrayList<MonthData> listOfSteps = monthToData.get(exactMonth);
        for (MonthData steps : listOfSteps) {
            sumOfSteps = sumOfSteps + steps.steps;
        }
        double calories = converter.convertCalories(sumOfSteps);
        return calories;
    }

    public int longestStreakOfGoalSteps(int exactMonth) { // Подряд выполненных целей
        int streak = 0;
        int longestStreak = 0;
        ArrayList<MonthData> listOfSteps = monthToData.get(exactMonth);
        for (MonthData steps : listOfSteps) {
            if (steps.steps >= stepGoal) {
                streak = streak + 1;
                if (streak > longestStreak) {
                    longestStreak = streak;
                }
            } else if (steps.steps < stepGoal) {
                streak = 0;
            }
        }
        return longestStreak;
    }


    public void newStepGoal() { // Цель шагов
        System.out.println("Введите желаемое количество шагов: ");
        int newSteps = scanner.nextInt();
        if (newSteps <= 0) {
            System.out.println("Введите целое число больше 0");
        } else {
            stepGoal = newSteps;
            System.out.println("Новая цель шагов в день: " + stepGoal);
        }
    }

}

