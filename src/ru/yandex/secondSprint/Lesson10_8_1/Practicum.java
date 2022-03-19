package ru.yandex.secondSprint.Lesson10_8_1;

public class Practicum {
    private static final double ACCEPTABLE_VIBRATION = 1;

    public static void main(String[] args) {
        ISS spaceStation = new ISS(10, 50, 800);
        System.out.println("Международная космическая станция.");
        System.out.println("Тест #745-093.");
        System.out.println("Уровень кислорода: " + spaceStation.getOxygenLevel());
        System.out.println("Уровень энергии: " + spaceStation.getEnergyReserve());
        System.out.println("Потребление энергии: " + spaceStation.getEnergyConsumption());
        System.out.println("Уровень топлива: " + spaceStation.fuel);

        System.out.println("\nСтыковка нового модуля...");

        Zvezda newModule = new Zvezda();

        spaceStation.moduleDocking(newModule);

        System.out.println("Модуль пристыкован. Проверка систем...");

        System.out.println("Уровень кислорода: " + spaceStation.getOxygenLevel());
        System.out.print("Потребление энергии: " + spaceStation.getEnergyConsumption());
        System.out.println(" (Уровень энергии: " + spaceStation.getEnergyReserve() + ")");
        System.out.print("Уровень вибраций: " + spaceStation.vibration);
        System.out.println(" (Допустимый уровень: " + ACCEPTABLE_VIBRATION + ")");
        System.out.println();

        if ((spaceStation.oxygenLevel < 0)
                || (spaceStation.getEnergyConsumption() > spaceStation.energyReserve)
                || (spaceStation.vibration > ACCEPTABLE_VIBRATION)) {
            System.out.println("⚠️ АВАРИЯ! ⚠️");
            System.out.println("Жизненно важные показатели на недопустимом уровне.");
            System.out.println("Тест #745-093 провален.");
        } else {
            System.out.println("Все показатели в норме.");
            System.out.println("Тест #745-093 успешно пройден.");
            System.out.println("Ваше звание повышено.");
            System.out.println("Тест #745-094 разблокирован.");
        }
    }
}