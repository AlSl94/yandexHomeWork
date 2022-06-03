package ru.yandex.Sprint.Sprint3.Lesson16_1_1;

public class Cat extends Pet{

    public Cat() {
        super(4);
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Мяу");
    }
}
