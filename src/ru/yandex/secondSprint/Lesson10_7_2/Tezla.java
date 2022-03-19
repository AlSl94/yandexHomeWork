package ru.yandex.secondSprint.Lesson10_7_2;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else speed = autoPilotMaxSpeed;
        // исправьте метод для ускорения при автопилоте
    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else speed = maxSpeed;
    }
    // переопределите метод для торможения
    @Override

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        } else speed = 0;
    }
}