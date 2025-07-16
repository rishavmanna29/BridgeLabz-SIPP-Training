public class StringConcatPerformance {
    public static void main(String[] args) {
        int count = 100000;

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < count; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + " ms");
    }
}
