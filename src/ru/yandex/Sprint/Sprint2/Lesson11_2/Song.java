package ru.yandex.Sprint.Sprint2.Lesson11_2;
import java.util.Objects;

public class Song {
        public final String title;
        public final String artist;
        public final String songwriter;

        public Song(String title, String artist, String songwriter) {
            this.title = title;
            this.artist = artist;
            this.songwriter = songwriter;
        }
        @Override
    public boolean equals(Object obj) {
            if (this == obj)
                return true; // Проверяем адреса объектов
            if (obj == null)
                return false;// Проверяем ссылку на null
            if (this.getClass() != obj.getClass())
                return false;
            Song anotherSong = (Song) obj; // Открываем доступ к полям другого объекта
            return Objects.equals(title, anotherSong.title) && //
                    Objects.equals(artist, anotherSong.artist) &&
                    Objects.equals(songwriter, anotherSong.songwriter);
        }
    }

