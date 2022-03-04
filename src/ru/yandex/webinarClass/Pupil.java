package ru.yandex.webinarClass;

public class Pupil {
    public String name;
    public int[] marks; // оценки

    Pupil(String name, int mathMark, int russianMark, int physicsMark) {
        this.name = name;
        this.marks = new int[] {mathMark, russianMark, physicsMark};

    }

    public float getAvgMark() {
        float avgMark = (marks[0] + marks[1] + marks[2]) / (float) marks.length;
        return avgMark;
    }

    public boolean hasOnlyExcellentMarks() {
        for (int mark : marks) {
            if (mark < 5) {
                return false;
            }
        }
        return true;
    }

    // option 1: public HashMap<String, Integer>;
    // option 2: class Mark {
    // String subjectName
    // int mark
}
