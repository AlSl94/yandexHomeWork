package ru.yandex.caloriesCount;

public class Main {

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();
        StepTracker stepTracker = new StepTracker();
        commandLine.handleCommands(stepTracker);
    }
}
