import java.util.*;

public class SetEquality {
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Set.of(3, 2, 1));
        System.out.println(areSetsEqual(s1, s2)); // true
    }
}
