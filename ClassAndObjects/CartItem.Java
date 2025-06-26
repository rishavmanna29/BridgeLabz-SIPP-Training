class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int amount) {
        quantity += amount;
        System.out.println(amount + " " + itemName + "(s) added to cart.");
    }

    public void removeItem(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " " + itemName + "(s) removed.");
        } else {
            System.out.println("Cannot remove more than you have.");
        }
    }

    public void displayTotalCost() {
        System.out.println("Total cost for " + itemName + ": ₹" + (price * quantity));
    }
}
