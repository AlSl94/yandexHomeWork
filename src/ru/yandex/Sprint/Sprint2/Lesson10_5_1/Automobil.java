package ru.yandex.Sprint.Sprint2.Lesson10_5_1;

class Automobile extends Transport{
    public Automobile() {
        wheelsNumber = 4;
    }

    protected String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}