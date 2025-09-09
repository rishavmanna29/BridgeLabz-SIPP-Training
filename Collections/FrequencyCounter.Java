import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> freq = new HashMap<>();
        for (String item : list) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange");
        System.out.println(countFrequency(items));
    }
}
