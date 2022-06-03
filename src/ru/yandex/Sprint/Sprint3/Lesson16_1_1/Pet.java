package ru.yandex.Sprint.Sprint3.Lesson16_1_1;

public abstract class Pet {
    private int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public void giveVoice() {
        System.out.println("Издаю звук");
    }

}
