package ru.yandex.Sprint.Sprint5.Lesson_2_5;

public class LimitException extends RuntimeException{
    private int attempts;

    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public String getDetailedMessage() {
        return getMessage() + " " + attempts;
    }

}
