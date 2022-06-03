package ru.yandex.Sprint.Sprint5.Lesson_2_5;

public class InputException extends Exception{

    public InputException(final String message) {
        super(message);
    }

    public String getDetailedMessage() {
        return getMessage();
    }
}
