package ru.yandex.Sprint.Sprint6.Lesson_3_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FortuneCookieFactoryTest {
    private static FortuneCookieFactory cookieFactory;

    @BeforeEach
    public void beforeEach() {
        cookieFactory = new FortuneCookieFactory(
                new FortuneConfig(true),
                List.of("POSITIVE"),
                List.of("NEGATIVE"));
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        cookieFactory.bakeFortuneCookie();
        Assertions.assertEquals(cookieFactory.getCookiesBaked(), 1);
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        cookieFactory.bakeFortuneCookie();
        cookieFactory.bakeFortuneCookie();
        Assertions.assertEquals(cookieFactory.getCookiesBaked(), 2);
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        cookieFactory.bakeFortuneCookie();
        Assertions.assertEquals(cookieFactory.getCookiesBaked(), 1);
        cookieFactory.resetCookiesCreated();
        Assertions.assertEquals(cookieFactory.getCookiesBaked(), 0);
    }
}