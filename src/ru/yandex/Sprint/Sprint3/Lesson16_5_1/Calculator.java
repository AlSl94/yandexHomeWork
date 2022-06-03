package ru.yandex.Sprint.Sprint3.Lesson16_5_1;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double runtime = 0;
        for (MediaItem media : mediaItems) {
            boolean isMovie = media instanceof Movie;
            if (isMovie) {
                runtime = runtime + media.getRuntime();
            } else if (media instanceof Series) {
                runtime = runtime + media.getRuntime() * ((Series) media).getSeriesCount();
            }
        }
        return runtime / 1440;
    }

}