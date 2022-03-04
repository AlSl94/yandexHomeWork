package ru.yandex.webinarClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        CommandLineManager commandLineManager = new CommandLineManager();
        commandLineManager.printMenuAndHandleCommand(journal);
    }
}
