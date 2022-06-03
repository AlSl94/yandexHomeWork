package ru.yandex.Sprint.Sprint3.Lesson16_7_1;

// Дополните класс для проверки возраста пользователя
public class AgeValidationRule extends ValidationRule<Byte> {

public AgeValidationRule(Byte age) {
        super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
        }

@Override
public boolean isValid() {
        if (value < 18) {
                return false;
        }
        return true;
}
}