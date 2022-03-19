package ru.yandex.accounting;

import ru.yandex.caloriesCount.MonthData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MonthlyReport {
    Scanner scanner = new Scanner(System.in);
    FileReader reader = new FileReader();
    ArrayList<MonthRep> monthDataInList = new ArrayList<MonthRep>();
    HashMap<String, ArrayList<MonthRep>> monthDataMap = new HashMap<>();
    String fileName;

    public void splitMonthLines() {
        fileName = scanner.nextLine();
        String fileContents = reader.monthReader(fileName);
        String[] lines = fileContents.split("\\n");
        for (int i = 1; i < lines.length; i++) {
            String[] lineContents = lines[i].split(",");
            monthDataInList.add(new MonthRep(lineContents[0], lineContents[1], lineContents[2], lineContents[3]));
            monthDataMap.put(fileName, monthDataInList);
        }
    }

    public void splitMonthForLoop() {

    }

    public void theMostProfitableItem() {
        int maxProfit = 0;
        String maxProfitItemName = "";
        for (MonthRep data : monthDataInList) {
            if (Boolean.parseBoolean(data.isExpense) == true) {
                int profit = Integer.parseInt(data.quantity) * Integer.parseInt(data.sumOfOne);
                if (profit > maxProfit) {
                    maxProfit = profit;
                    maxProfitItemName = data.itemName;
                }
            }
        }
        System.out.println("Самый прибыльный товар: " + maxProfitItemName + " на сумму " + maxProfit);
    }

    public void maxExpense() {
        int maxExpense = 0;
        String maxExpenseItemName = "";
        for (MonthRep data : monthDataInList) {
            if (Boolean.parseBoolean(data.isExpense) == true) {
                int expense = Integer.parseInt(data.quantity) * Integer.parseInt(data.sumOfOne);
                if (maxExpense < expense) {
                    maxExpense = expense;
                    maxExpenseItemName = data.itemName;
                }
            }
        }
        System.out.println("Максимальная трата: " + maxExpenseItemName + " на сумму " + maxExpense);
    }

    public void monthInfo() {
        switch (fileName) {
            case "202101":
                System.out.println("Янаварь");
                theMostProfitableItem();
                maxExpense();
                break;
            case "202102":
                System.out.println("Февраль");
                theMostProfitableItem();
                break;
            case "202103":
                System.out.println("Март");
                theMostProfitableItem();
                break;
        }
    }


}