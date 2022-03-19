package ru.yandex.secondSprint.Lesson10_5_1;

class TezlaCar extends Automobile{
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public TezlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 10;
    }

    protected void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
    }
}