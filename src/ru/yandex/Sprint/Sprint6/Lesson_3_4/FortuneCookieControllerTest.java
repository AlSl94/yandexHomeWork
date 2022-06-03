package ru.yandex.Sprint.Sprint6.Lesson_3_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FortuneCookieControllerTest {
    private static FortuneCookieController cookieControllerPositive;
    private static FortuneCookieController cookieControllerNegative;

    @BeforeEach
    public void beforeEach() {
        cookieControllerPositive = new FortuneCookieController
                (new FortuneCookieFactory
                        (new FortuneConfig(true), List.of("POSITIVE"), List.of("NEGATIVE")));
        cookieControllerNegative = new FortuneCookieController
                (new FortuneCookieFactory
                        (new FortuneConfig(false), List.of("POSITIVE"), List.of("NEGATIVE")));
    }

    @Test
    public void shouldReturnPositiveFortune() {
        cookieControllerPositive.tellFortune();
        Assertions.assertEquals(cookieControllerPositive.tellFortune().getFortuneText(), "POSITIVE");
    }

    @Test
    public void shouldReturnNegativeFortune() {
        cookieControllerNegative.tellFortune();
        Assertions.assertEquals(cookieControllerNegative.tellFortune().getFortuneText(), "NEGATIVE");
    }
}
