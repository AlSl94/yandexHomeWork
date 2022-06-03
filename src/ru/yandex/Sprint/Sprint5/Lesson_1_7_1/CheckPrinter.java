package ru.yandex.Sprint.Sprint5.Lesson_1_7_1;

    public class CheckPrinter {
        public void printCheck(String[] items) {
            for (String item: items) {
                String[] splitted = item.split(",");
                System.out.printf("%7s, %5s, %-6s \n", splitted[0], splitted[1], splitted[2]);
            }
        }

        public static void main(String[] args) {
            CheckPrinter checkPrinter = new CheckPrinter();
            String[] test = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
            checkPrinter.printCheck(test);
        }
    }



