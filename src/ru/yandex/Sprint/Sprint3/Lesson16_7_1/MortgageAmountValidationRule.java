package ru.yandex.Sprint.Sprint3.Lesson16_7_1;

// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule<Integer> {

public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
}       // Объявите и реализуйте метод для проверки суммы ипотеки ниже

        public boolean isValid() {
        if (value < 1_000_000 || value > 10_000_000) {
                return false;
        } else return true;
}
}