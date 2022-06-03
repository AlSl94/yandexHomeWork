package ru.yandex.Sprint.Sprint3.Lesson16_7_1;
// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule extends ValidationRule<Boolean> {

public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
        }

@Override
public boolean isValid() {
        return value;
}
}