package ru.yandex.Sprint.Sprint5.Lesson_2_7.validators;


import ru.yandex.Sprint.Sprint5.Lesson_2_7.exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}