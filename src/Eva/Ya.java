package Eva;

import java.util.Scanner;

public class Ya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ghosts = "призраки завтра"; // 1
        System.out.println("Здравствуйте, " + ghosts); // 1

        System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать."); // 2
        int command = scanner.nextInt(); // 2
        if (command == 2) { // 2
            return; // 2
        } //

        int[] examples = {665 + 229, 1827 + 3374, 3726 + 924, 150 + 17283, 233 + 384, 3344 + 22234}; // 3
        int maxResult = 0; // 3
        for (int i = 0; i < examples.length; i++) { // 3
            if (examples[i] > maxResult) { // 3
                maxResult = examples[i]; // 3
            } // 3
        } // 3
        System.out.println("Самая большая сумма чисел в массиве " + maxResult); // 3
        System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать."); // 3
        command = scanner.nextInt(); // 2

        double[] expenses = {100.50, 55.0, 10.6, 150.20, 10.0, 1.0, 15.4}; // 4
        double minExpense = expenses[0]; // 4
        for (int i = 1; i < expenses.length; i++) { // 4
            if (expenses[i] < minExpense) { // 4
                minExpense = expenses[i]; // 4
             } // 4
        } // 4
        System.out.println("Самая маленькая трата за неделю " + minExpense); // 4

        System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать."); // 2
        command = scanner.nextInt(); // 2

        System.out.println("Сколько весит хомяк Байт?"); // 5
        int weight = scanner.nextInt();
        if (weight < 800) {
            for (int i = 1; i < 6; i = i + 1) {
                System.out.println("Байт съел " + i + "-ю морковку");
            }
        } else {
            System.out.println("Разгрузочный день. Пьём водичку, крутим колесо!");
        }

        System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать."); // 2
        command = scanner.nextInt(); // 2

        double sum = 0;
        for (int i = 0; i < expenses.length; i++) { // 6
            sum = sum + expenses[i];
        }
        System.out.println("Сумма трат за неделю составила " + sum);

        System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать."); // 2
        command = scanner.nextInt();

        String myLoveCity = "мой любимый город!"; // 7
        System.out.println("До свидания," + myLoveCity);
    }
}
