package ru.yandex.Sprint.Sprint5.Lesson_2_7.validators;

import ru.yandex.Sprint.Sprint5.Lesson_2_7.exceptions.ValidateException;
import ru.yandex.Sprint.Sprint5.Lesson_2_7.exceptions.ValidateNameException;

public class NameValidator implements Validator {

    private boolean hasName (final String name) {
        for (int counter = 0; counter < name.length(); counter++) {
            if (Character.isLetter(name.charAt(counter))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void validate(String name) throws ValidateException {
        if (!hasName(name)) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}
