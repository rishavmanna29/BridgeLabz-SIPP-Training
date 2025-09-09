import java.util.*;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDiff(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        Set<T> common = new HashSet<>(a);
        common.retainAll(b);
        result.removeAll(common);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> a = Set.of(1, 2, 3);
        Set<Integer> b = Set.of(3, 4, 5);
        System.out.println("Symmetric Difference: " + symmetricDiff(a, b)); // [1, 2, 4, 5]
    }
}
