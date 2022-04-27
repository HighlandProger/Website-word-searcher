package ru.freeman98.gitLab;

import java.util.Map;

public class MapHandler {

    private static void printResult(String key, int value) {
        System.out.println(key + " = " + value);
    }

    public static void printSortedWordMap(Map<String, Integer> wordMap) {

        wordMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> printResult(entry.getKey(), entry.getValue()));
    }
}
