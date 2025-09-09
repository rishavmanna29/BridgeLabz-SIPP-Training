import java.util.*;

public class SetToSortedList {
    public static List<Integer> toSortedList(Set<Integer> set) {
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        return sorted;
    }

    public static void main(String[] args) {
        Set<Integer> set = Set.of(5, 3, 9, 1);
        System.out.println(toSortedList(set)); // [1, 3, 5, 9]
    }
}
