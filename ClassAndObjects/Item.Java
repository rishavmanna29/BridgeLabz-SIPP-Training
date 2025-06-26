import java.util.*;

class Item {
    private String itemCode;
    private String itemName;
    private float itemPrice;

    public Item(String itemCode, String itemName, float itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void displayItemDetails() {
        System.out.println("Item details are as follows:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + itemPrice);
    }

    public float calculateTotalCostOfGivenQuantity(int quantity) {
        return itemPrice * quantity;
    }

    public String getItemCode() {
        return itemCode;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items you want to enter: ");
        int items1 = input.nextInt();
        input.nextLine();

        Item[] items = new Item[items1];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Enter item code: ");
            String code = input.nextLine().trim();
            System.out.print("Enter item name: ");
            String name = input.nextLine().trim();
            System.out.print("Enter item price: ");
            float price = input.nextFloat();
            input.nextLine();
            items[i] = new Item(code, name, price);
        }

        System.out.print("Enter item code to search: ");
        String searchCode = input.nextLine().trim();

        Item foundItem = null;

        for (int i = 0; i < items.length; i++) {
            if (items[i].getItemCode().equals(searchCode)) {
                foundItem = items[i];
                break;
            }
        }

        if (foundItem == null) {
            System.out.println("Item code not found.");
        } else {
            foundItem.displayItemDetails();
            System.out.print("Enter quantity: ");
            int qty = input.nextInt();
            System.out.println("Total cost: " + foundItem.calculateTotalCostOfGivenQuantity(qty));
        }
    }
}
