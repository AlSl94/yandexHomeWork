package ru.yandex.Sprint.Sprint6.Lesson_3_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscountForValue999() {
        // Подготовка
        int buySum = 999;
        int expectedSum = 999;
        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGiveNoDiscountForValue1() {
        // Подготовка
        int buySum = 1;
        int expectedSum = 1;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGiveNoDiscountForValue333() {
        // Подготовка
        int buySum = 333;
        int expectedSum = 333;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGive2PercentDiscountForValue1000() {
        // Подготовка
        int buySum = 1000;
        double expectedSum = 1000 * 0.98;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGive2PercentDiscountForValue2000() {
        // Подготовка
        int buySum = 2000;
        double expectedSum = 2000 * 0.98;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
}