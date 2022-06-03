package ru.yandex.Sprint.Sprint2.Lesson_11_Facultative;

import java.util.Objects;

class Person {
    public String firstName; // поле имя
    public String lastName; // поле фамилия

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) { // метод equals переопределён
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override // не забываем об аннотации
    public int hashCode() {
        int hash = 17; // объявляем и инициализируем переменную hash
        if (firstName != null) { // проверяем значение первого поля
            hash = firstName.hashCode(); // вычисляем хеш первого поля
        }
        if (lastName != null) { // проверяем значение второго поля
            hash = hash + lastName.hashCode(); // вычисляем хеш второго поля и общий хеш
        }
        return hash; // возвращаем хеш
    }
}