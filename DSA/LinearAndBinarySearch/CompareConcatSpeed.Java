public class CompareConcatSpeed {
    public static void main(String[] args) {
        int count = 1_000_000;

        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append("hello");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sbd.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}
