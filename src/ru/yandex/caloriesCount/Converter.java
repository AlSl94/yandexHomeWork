package ru.yandex.caloriesCount;

public class Converter {
    int cmPerStep = 75;
    int caloriePerStep = 50;

    double convertDistance(int steps) {
        double distance = (steps * cmPerStep) / 100_000;
        return distance;
    }

    double convertCalories(int steps) {
        double kiloCalories = (steps * caloriePerStep) * 1000;
        return kiloCalories;
    }
}
