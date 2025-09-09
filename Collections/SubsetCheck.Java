import java.util.*;

public class SubsetCheck {
    public static <T> boolean isSubset(Set<T> a, Set<T> b) {
        return b.containsAll(a);
    }

    public static void main(String[] args) {
        Set<Integer> a = Set.of(2, 3);
        Set<Integer> b = Set.of(1, 2, 3, 4);
        System.out.println(isSubset(a, b)); // true
    }
}
