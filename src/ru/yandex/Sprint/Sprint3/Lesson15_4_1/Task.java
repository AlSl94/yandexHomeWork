package ru.yandex.Sprint.Sprint3.Lesson15_4_1;

public class Task {

    private TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority priority, String description) { // добавьте конструктор класса
        this.priority = priority;
        this.description = description;
    }

    public TaskPriority getPriority() { // добавьте метод get для приоритета
        return priority;
    }


    public String getDescription() {
        return description;
    }
}