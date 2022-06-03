package ru.yandex.Sprint.Sprint6.Lesson_1_1;

interface StringsSaverConfig {
    // как нужно преобразовать сохраняемую строку?
    String transform(String line);

    // дополнительное действие при сохранении
    void onSave(String line);
}
