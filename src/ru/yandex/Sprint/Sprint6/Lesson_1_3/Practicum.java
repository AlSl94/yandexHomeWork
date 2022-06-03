package ru.yandex.Sprint.Sprint6.Lesson_1_3;

public class Practicum {


    public static void main(String[] args) {
        FilteredSaver saver = new FilteredSaver();
        saver.setOnSaveListener(line -> {System.out.println("СОХРАНЕНО: " + line);});
        saver.addFilter(line -> {return line.contains("ВАЖНО");});
        saver.addFilter(line -> {return line.endsWith("!");});

        saver.save("Привет!");  // не сохранится
        saver.save("ВАЖНО - это важное слово"); // не сохранится
        saver.save("ВАЖНО! Не забывай его использовать для заметок!"); // сохранится и выведется на экран
        saver.save("Но и память тренировать тоже очень ВАЖНО!");    // сохранится и выведется на экран
        System.out.println(saver.getSaved());   // список из двух сохранённых сообщений
    }
}
