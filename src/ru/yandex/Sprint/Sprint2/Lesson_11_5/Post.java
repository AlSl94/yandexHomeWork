package ru.yandex.Sprint.Sprint2.Lesson_11_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList<PostComment> comments;

    public Post() {
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setTags(String[] tags) {
        this.tags = tags;
    }


    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    public String toString() {
        return "Post{" +
                "title='" + title + "'" +
                ", content.length='" + content.length() + "'" +
                ", tags=" + Arrays.toString(tags) + // Функция метода Arrays
                ", comments=" + comments.toString() +
                "}";
    }
}
