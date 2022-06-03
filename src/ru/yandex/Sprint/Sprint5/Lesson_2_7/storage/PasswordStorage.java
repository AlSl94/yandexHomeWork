package ru.yandex.Sprint.Sprint5.Lesson_2_7.storage;

import java.io.IOException;

public interface PasswordStorage {
    void open() throws IOException;
    void store(String user, String password) throws IOException;
    String get(String user) throws IOException;
    void close();
}