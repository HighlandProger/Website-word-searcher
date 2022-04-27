package ru.freeman98.gitLab;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSite {

    private static final String URL_STRING = "https://news.yandex.ru/computers.html";

    public int getWordMatchesCount(String word) {

        int count = 0;
        try (Scanner scanner = new Scanner((InputStream) new URL(URL_STRING).getContent())) {

            StringBuilder webPageString = new StringBuilder();
            while (scanner.hasNext()) {
                webPageString.append(scanner.nextLine());

                Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(webPageString);
                while (matcher.find()) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
