package ru.yandex.Sprint.Sprint6.Lesson_2_4;

class AirportDatabase {
    private static Airport vnukovo = new Airport(
            "Внуково",
            "Москва",
            "MOSCOW          ",
            "Europe/Moscow"
    );

    private static Airport pulkovo = new Airport(
            "Пулково",
            "Санкт-Петербург",
            "SAINT-PETERSBURG",
            "Europe/Moscow"
    );

    private static Airport vladivostok = new Airport(
            "Владивосток",
            "Владивосток",
            "VLADIVOSTOK     ",
            "Asia/Vladivostok"
    );

    private static Airport koltsovo = new Airport(
            "Кольцово",
            "Екатеринбург",
            "YEKATERINBURG   ",
            "Asia/Yekaterinburg"
    );

    public static Airport getAirportByCode(String airportCode) {
        switch (airportCode) {
            case "VKO":
                return vnukovo;
            case "LED":
                return pulkovo;
            case "SVX":
                return koltsovo;
            case "VVO":
                return vladivostok;
            default:
                throw new IllegalStateException("Неизвестный код аэропорта " + airportCode);
        }
    }
}