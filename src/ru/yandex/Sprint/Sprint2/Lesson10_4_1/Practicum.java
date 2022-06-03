package ru.yandex.Sprint.Sprint2.Lesson10_4_1;

public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        System.out.println("Со счета снято " + moneyAmount + " р.");
        moneyAmount = moneyAmount - moneyAmount;
    }
    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
}