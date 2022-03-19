package ru.yandex.secondSprint.Lesson10_5_1;

class TezlaTruck extends TezlaCar{
    protected double maxSpeedByDirt;

    public TezlaTruck() {
        maxSpeedByDirt = 30;
    }

    public void accelerateByDirt() {
        if (speed < maxSpeedByDirt) {
            speed += acceleration * 0.5;
        }
    }

    public void brakeByDirt() {
        if (speed > 0) {
            speed -= brakingSpeed * 0.5;
        }
    }
}