package ru.yandex.Sprint.Sprint2.Lesson10_8_1;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }
    // доступ к созданию новых конструкторов запрещён
    @Override
    protected void activateModule() {
        turnSolarPanels();
    }
    // разрешено переопределение методов
}
