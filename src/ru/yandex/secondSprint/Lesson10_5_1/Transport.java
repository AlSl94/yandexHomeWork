package ru.yandex.secondSprint.Lesson10_5_1;

class Transport {
    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double brakingSpeed;
    protected int wheelsNumber;

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}
