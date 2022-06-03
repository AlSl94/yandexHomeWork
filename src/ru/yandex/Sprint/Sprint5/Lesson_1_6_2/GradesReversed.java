package ru.yandex.Sprint.Sprint5.Lesson_1_6_2;

import java.util.Locale;

public class GradesReversed {
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        String defaultString = "";
        for (String grade : grades) {
            String[] line = grade.split(" ");
            String newString = String.join(",", line[0].toLowerCase(), line[1].toLowerCase(),
                    line[2], gradeStringToInt(line[4]));
            defaultString = defaultString + newString + ";";
        }
        return defaultString;
    }

    public static void main(String[] args) {
        GradesReversed grades = new GradesReversed();
    }
}
