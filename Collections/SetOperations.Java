import java.util.*;

public class SetOperations {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> a = Set.of(1, 2, 3);
        Set<Integer> b = Set.of(3, 4, 5);
        System.out.println("Union: " + union(a, b));           // [1, 2, 3, 4, 5]
        System.out.println("Intersection: " + intersection(a, b)); // [3]
    }
}
