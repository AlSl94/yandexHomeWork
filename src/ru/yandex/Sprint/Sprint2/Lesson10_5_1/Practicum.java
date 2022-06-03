package ru.yandex.Sprint.Sprint2.Lesson10_5_1;

class Practicum {
    public static void main(String[] args) {
        ModelZ testCar = new ModelZ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.acceleration + " км/(ч*с)");
        System.out.println("Максимальная скорость: " + testCar.maxSpeed + " км/ч");
        // Символ \n позволяет оставлять пустую строку в консоли
        System.out.println("\nНачало теста!");
        System.out.println("Количество колёс: " + testCar.wheelsNumber);

        testCar.turnTo("Север");
        System.out.println("Направление: " + testCar.direction);
        System.out.println("Едем на автопилоте:");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Z спустя 5с на автопилоте: " + testCar.speed + " км/ч");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Z спустя ещё 5с на автопилоте: " + testCar.speed + " км/ч");

        System.out.println("Переходим в ручной режим:");
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.println("Скорость Z спустя 2с в ручном режиме: " + testCar.speed + " км/ч");
        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.speed > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.println("Время торможения до полной остановки: " + brakingTime + "c");
    }
}