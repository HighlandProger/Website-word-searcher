package ru.freeman98.gitLab;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<String, Integer> wordMap = new HashMap<>();
        WebSite webSite = new WebSite();

        for (String word : args) {
            wordMap.put(word, webSite.getWordMatchesCount(word));
        }

        MapHandler.printSortedWordMap(wordMap);
    }
}
