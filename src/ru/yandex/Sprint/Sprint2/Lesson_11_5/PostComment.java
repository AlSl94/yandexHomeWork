package ru.yandex.Sprint.Sprint2.Lesson_11_5;

import java.util.Arrays;

public class PostComment {
    private String text; // Содержание комментария
    private String[] whoLiked; // Кто поддержал

    public PostComment() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    public String toString() {
        if (whoLiked != null) {
            return
                    "PostComment{" +
                    "text='" + text + "'" +
                    ", whoLiked=" + Arrays.toString(whoLiked);
        } else return
                "PostComment{" +
                "text='" + text + "'" +
                ", whoLiked=null";
    }
}