package ru.yandex.accounting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReader {
    Scanner scanner = new Scanner(System.in);
    private String readFileContentsOrNull(String path)
    {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }
    public String monthReader(String fileName) {
        String fileContents = readFileContentsOrNull("/Users/alsl/Java/IdeaProjects/YandexHomeWork/src" +
                "/ru/yandex/accounting/resources/m." + fileName + ".csv");
        return fileContents;
    }

}
