package ru.yandex.Sprint.Sprint5.Lesson_2_7.validators;

import ru.yandex.Sprint.Sprint5.Lesson_2_7.exceptions.ValidateException;
import ru.yandex.Sprint.Sprint5.Lesson_2_7.exceptions.ValidatePasswordException;

public class PasswordLengthValidator implements Validator {
    private final int minLength;

    public PasswordLengthValidator(final int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(final String password) throws ValidateException {
        if (password == null || password.length() < minLength) {
            throw new ValidatePasswordException(
                    String.format("Пароль должен быть больше %d символов", minLength)
            );
        }
    }
}