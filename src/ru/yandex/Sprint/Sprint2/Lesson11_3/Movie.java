package ru.yandex.Sprint.Sprint2.Lesson11_3;

import java.util.Objects;

public class Movie {
    String title;
    int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String description() { // Метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Movie diffMovie = (Movie) obj;
        return Objects.equals(title, diffMovie.title)
                && (releaseYear == diffMovie.releaseYear);
    }
    @Override
    public int hashCode() {
        int hash = 22;
        if (title != null) {
            hash = hash + title.hashCode();
        }
        hash = hash * 35;
        return hash;
    }
}
