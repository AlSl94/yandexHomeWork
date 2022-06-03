package ru.yandex.Sprint.Sprint3.Lesson15_5_1;

public class RecyclableMaterial {
    // объявите переменные с правильными модификаторами
    private final int code;
    private final MaterialType type;
    private final boolean isRecyclable;
    private final String description;


    RecyclableMaterial(int code, MaterialType type, boolean isRecyclable, String description) {
        this.code = code;
        this.type = type;
        this.isRecyclable = isRecyclable;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public MaterialType getType() {
        return type;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public String getDescription() {
        return description;
    }
}