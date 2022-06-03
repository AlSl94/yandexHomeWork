package ru.yandex.Sprint.Sprint6.Lesson_3_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    private static ReversePolishNotationCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(calculator.calculatePolishNotation("5      2 + "), 7);
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(calculator.calculatePolishNotation("5 2 -"), 3);
    }

    @Test
    public void shouldMultiplicate() {
        Assertions.assertEquals(calculator.calculatePolishNotation("5 2 *"), 10);
    }
}
