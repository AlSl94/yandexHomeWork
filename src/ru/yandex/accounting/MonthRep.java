package ru.yandex.accounting;

public class MonthRep {
    String itemName;
    String isExpense;
    String quantity;
    String sumOfOne;

    MonthRep(String itemName, String isExpense, String quantity, String sumOfOne) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }
}
