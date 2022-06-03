package ru.yandex.Sprint.Sprint5.Lesson_3_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.
        while(br.ready()) {
            String line = br.readLine();
            int rate = frequencyMap.getOrDefault(line, 0);
            frequencyMap.put(line, ++rate);
        }
        br.close();

        // выведите результат в формате "<буква>: <количество>".
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ": " + val);
        }
    }
}
