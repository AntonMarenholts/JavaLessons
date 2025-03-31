package lesson45.hw45;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    /*
    Частотный словарь слов: Напишите метод,
    который принимает строку текста и возвращает Map<String, Integer>,
    где каждому слову соответствует количество его вхождений в текст.
     */

    public static Map<String, Integer> getWordFrequency(String text) {
        if (text == null || text.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        // Разделяем текст на слова, используя пробелы и знаки препинания в качестве разделителей
        String[] words = text.toLowerCase().split("[\\s\\p{Punct}]+");

        for (String word : words) {
            // Убираем лишние пробелы и проверяем, не пустое ли слово
            word = word.trim();
            if (!word.isEmpty()) {
                // Если слово уже есть в карте, увеличиваем счетчик, иначе добавляем слово со счетчиком 1
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequencyMap;
    }

    public static void main(String[] args) {

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";
        Map<String, Integer> frequencyMap = getWordFrequency(text);
        System.out.println(frequencyMap);
    }
    }



