package ru.yandex.Sprint.Sprint6.Lesson_1_4_0;

import java.util.function.Predicate;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Practicum {

    public static void main(String[] args) {
        Person kostya = new Person("Костя", 5);
        Predicate<Person> ageCheck = (Person person) -> (kostya.getAge() < person.getAge());
        System.out.println(ageCheck.test(new Person("Старше", 10))); // true
        System.out.println(ageCheck.test(new Person("Младше", 3))); // false
    }
}