package ru.yandex.Sprint.Sprint3.Lesson16_4_1;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    public Smartphone(String number) {
        super(number);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public final void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + "по номеру " + targetNumber);
        makeCall(targetNumber);
        sendSms(targetNumber, "Privet");
    }

}