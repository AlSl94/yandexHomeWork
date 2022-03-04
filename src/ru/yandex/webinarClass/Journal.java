package ru.yandex.webinarClass;

import java.util.ArrayList;

public class Journal {
    ArrayList<Pupil> pupils;

    Journal() {
        pupils = new ArrayList<>();
    }

    public void addPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    public int getPupilsTotalCount() {
        return pupils.size();
    }

    public int getsOnlyExcellentMarksCount() {
        int pupilsWithOnlyExcellentMarks = 0;
        for (Pupil pupil : pupils) {
            if (pupil.hasOnlyExcellentMarks()) {
                pupilsWithOnlyExcellentMarks = pupilsWithOnlyExcellentMarks + 1;
            }
        }
        return pupilsWithOnlyExcellentMarks;
    }

    public float getOnlyPupilsWithExcellentMarksPercent() {
        return (float) getsOnlyExcellentMarksCount() / getPupilsTotalCount();
    }

    public void printAvgMarks() {
        System.out.println("Средние оценки: ");
        for (Pupil pupil : pupils) {
            System.out.println(pupil.name + ": " + pupil.getAvgMark());
        }
    }

    public void printPupilsWithExcellentMarksPercent() {
        System.out.println("Процент отличников: " + getOnlyPupilsWithExcellentMarksPercent());
    }
}
