import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> original = Map.of("A", 1, "B", 2, "C", 1);
        System.out.println(invert(original)); // {1=[A, C], 2=[B]}
    }
}
