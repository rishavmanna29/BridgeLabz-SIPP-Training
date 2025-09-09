import java.util.*;
import java.io.*;

public class WordFrequency {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        for (String word : text.split("\\s+")) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println(countWords(input)); // {hello=2, world=1, java=1}
    }
}
