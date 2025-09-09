import java.util.*;

public class RotateList {
    public static <T> void rotate(List<T> list, int k) {
        int size = list.size();
        k = k % size;
        List<T> rotated = new ArrayList<>(list.subList(k, size));
        rotated.addAll(list.subList(0, k));
        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        rotate(data, 2);
        System.out.println(data);
    }
}
