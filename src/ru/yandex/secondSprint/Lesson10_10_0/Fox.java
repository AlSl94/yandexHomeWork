package ru.yandex.secondSprint.Lesson10_10_0;

class Fox extends Animal {
    private String color;

    public Fox(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String say() {
        return "Пиу пиу";
    }
    // научите лису говорить
}