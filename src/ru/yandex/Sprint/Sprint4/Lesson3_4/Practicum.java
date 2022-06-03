package ru.yandex.Sprint.Sprint4.Lesson3_4;

import java.util.HashMap;
import java.util.Map;

class Practicum {
    private static Map<Long, User> users = new HashMap();

    public static void main(String[] args) {
        // создадим 10 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            User user = new User(i, "Имя " + i);
            users.put(user.id, user);
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(Long userId) {

        return users.get(userId);

    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }

    }
}