public class QuickSortProductPrices {
    public static void main(String[] args) {
        int[] prices = {899, 299, 499, 150, 700};

        // Again, use simple Bubble Sort for simplicity
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 0; j < prices.length - 1 - i; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Product Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
