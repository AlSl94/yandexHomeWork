package ru.yandex.Sprint.Sprint3.Lesson16_3_1;

public class Circle implements Figure{
    // Радиус круга
    private final double r;


    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
