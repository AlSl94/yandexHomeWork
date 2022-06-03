package ru.yandex.Sprint.Sprint6.Lesson_1_4;

import java.util.*;

public class Practicum {

    public static void main(String[] args) {
        List<String> graduatesClub = new ArrayList<>();

        Set<String> contestWinners = new HashSet<>();
        contestWinners.add("Иван Петров");
        contestWinners.add("Пётр Иванов");

        Set<String> covidStudents = new HashSet<>();

        University uni = new University();
        uni.setOnGraduate(graduatesClub::add);
        uni.setExamsFreeTester(contestWinners::contains);
        uni.setOpenTester(covidStudents::isEmpty);
        uni.setStudentToGroup(String::length);

        System.out.println("Открыт ли универсистет? ");
        uni.isUniOpen();

        String student = "Яна Практикумова";
        System.out.println("Может ли " + student + " поступить без экзаменов?");
        uni.tryWithoutExams(student);

        uni.printStudentGroup(student);

        uni.graduate(student);
    }
}