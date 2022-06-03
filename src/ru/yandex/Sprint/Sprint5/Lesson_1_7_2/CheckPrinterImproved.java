package ru.yandex.Sprint.Sprint5.Lesson_1_7_2;

import ru.yandex.Sprint.Sprint5.Lesson_1_7_1.CheckPrinter;

public class CheckPrinterImproved {

    private int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public void printCheck(String[] items) {
        String[] itemLength = new String[items.length];
        String[] quantityLength = new String[items.length];
        String[] priceLength = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            String[] str = items[i].split(",");
            itemLength[i] = str[0];
            quantityLength[i] = str[1];
            priceLength[i] = str[2];
        }

        int maxItemLength = findMaxLength(itemLength) + 2;
        int maxQuantityLength = findMaxLength(quantityLength) + 2;
        int maxPriceLength = findMaxLength(priceLength) + 2;

        for (String item : items) {
            String[] lines = item.split(",");
            Integer maxLength = findMaxLength(lines);
            findMaxLength(lines);
            System.out.printf("%-" + maxItemLength + "s" + "%-" +
                    maxQuantityLength + "s" + "%-" + maxPriceLength + "s\n",
                    lines[0] + ",", lines[1] + ",", lines[2]);
        }
    }

    public static void main(String[] args) {
        CheckPrinterImproved checkPrinter = new CheckPrinterImproved();
        String[] test = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
        checkPrinter.printCheck(test);
    }
}