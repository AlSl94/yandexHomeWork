package ru.yandex.Sprint.Sprint3.Lesson15_1_1;

import java.util.List;

    public class Forest {
        private List<MountainHare> hares;
        // объявите недостающие переменные и добавьте конструктор
        private static String season;

        public Forest(List<MountainHare> hares) {
            this.hares = hares;
        }

        // добавьте метод setSeason(String newSeason)
        // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
        public static void setSeason(String newSeason) {
            if (newSeason.equals("лето")) {
                season = newSeason;
                MountainHare.color = "серо-рыжий";
            } else if (newSeason.equals("зима")) {
                season = newSeason;
                MountainHare.color = "белый";
            } else return;
        }

        // добавьте метод printHares()
        public void printHares() {
            for (MountainHare hare : hares) {
                System.out.println(hare);
            }
        }
    }
