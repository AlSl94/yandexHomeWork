package ru.yandex.Sprint.Sprint3.Lesson16_4_1;

public class MobilePhone extends Phone{

    public MobilePhone(String number) {
        super(number);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

}