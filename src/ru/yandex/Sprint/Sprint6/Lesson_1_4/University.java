package ru.yandex.Sprint.Sprint6.Lesson_1_4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class University {
    private Consumer<String> onGraduate;
    private Predicate<String> examsFreeTester;
    private Supplier<Boolean> openTester;
    private Function<String, Integer> studentToGroup;

    public void setOnGraduate(Consumer<String> onGraduate) {
        this.onGraduate = onGraduate;
    }

    public void graduate(String student) {
        System.out.println("Студент(ка) " + student + " успешно окончил(а) университет.");
        if (onGraduate != null) {
            onGraduate.accept(student);
        }
    }

    public void setExamsFreeTester(Predicate<String> examsFreeTester) {
        this.examsFreeTester = examsFreeTester;
    }

    public boolean tryWithoutExams(String candidate) {
        if (examsFreeTester == null) {
            return false;
        }
        if (examsFreeTester.test(candidate)) {
            System.out.println("Абитуриент " + candidate + " поступает без экзаменов! :)");
            return true;
        } else {
            System.out.println("Абитуриент " + candidate + " не может поступить без экзаменов. :(");
            return false;
        }
    }

    public void setOpenTester(Supplier<Boolean> openTester) {
        this.openTester = openTester;
    }

    public boolean isUniOpen() {
        if (openTester == null) {
            return false;
        }
        if (openTester.get()) {
            System.out.println("Здание университета открыто для посещения.");
            return true;
        } else {
            System.out.println("Здание университета закрыто для посещения.");
            return false;
        }
    }

    public void setStudentToGroup(Function<String, Integer> studentToGroup) {
        this.studentToGroup = studentToGroup;
    }

    public void printStudentGroup(String student) {
        if (studentToGroup == null) {
            System.out.println("Группы в университете ещё не созданы.");
            return;
        }
        System.out.println("Студенту " + student
                + " следует пройти в аудиторию для занятий у группы №"
                + studentToGroup.apply(student));
    }
}
