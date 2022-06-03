package ru.yandex.Sprint.Sprint5.Lesson_1_6_1;


public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] splitLine = grades.split(";");
        StringBuilder sb = new StringBuilder();
        for (String grade : splitLine) {
            String[] finalSplit = grade.split(",");
            String name = finalSplit[0];
            String secondName = finalSplit[1];
            String obj = finalSplit[2];
            String score = finalSplit[3];
            sb.append(capitalize(name) + " ");
            sb.append(capitalize(secondName) + " ");
            sb.append(obj.toLowerCase() + " — ");
            sb.append(gradeToString(score) + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");
    }
}
