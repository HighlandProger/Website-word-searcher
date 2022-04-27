# Java Website Word Searcher project

## This program prints words from "https://news.yandex.ru/computers.html" and their count. Case of words is insensitive.

####To run this application open the terminal in the current folder and execute next commands:

- mvn clean compile
- mvn exec:java -Dexec.mainClass="ru.freeman98.gitLab.Application" -Dexec.args="(Write here the searching words)"

Example: mvn exec:java -Dexec.mainClass="ru.freeman98.gitLab.Application" -Dexec.args="новости технологии"

Above the string "BUILD SUCCESS" you will see sorted by count words you searched for.

