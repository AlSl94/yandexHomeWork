package ru.yandex.Sprint.Sprint3.Lesson15_2_1;

public class TransactionValidator {
    // объявите константы
    public static final double MIN_AMOUNT = 1;
    public static final double MAX_AMOUNT = 5000;
    // объявите метод isValidAmount()
    public static boolean isValidAmount(double amount) {
        // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}
