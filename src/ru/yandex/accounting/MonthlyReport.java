package ru.yandex.accounting;

import ru.yandex.caloriesCount.MonthData;

import java.util.ArrayList;
import java.util.Scanner;

public class MonthlyReport {
    Scanner scanner = new Scanner(System.in);
    FileReader reader = new FileReader();
    ArrayList<MonthRep> monthDataInList = new ArrayList<MonthRep>();

    public void splitLines() {
       // String fileName = scanner.nextLine();
        String fileContents = reader.monthReader("202101");
        String[] lines = fileContents.split("\\n");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
        for (int i = 1; i < lines.length; i++) {
            String[] lineContents = lines[i].split(",");
            monthDataInList.add(new MonthRep(lineContents[0], lineContents[1], lineContents[2], lineContents[3]));
        }
    }
}