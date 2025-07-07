import java.util.Scanner;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    Item head = null;

    // Add at beginning
    public void addAtBeginning(Item newItem) {
        newItem.next = head;
        head = newItem;
    }

    // Add at end
    public void addAtEnd(Item newItem) {
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(Item newItem, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newItem);
            return;
        }
        Item temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove item by ID
    public void removeById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    // Update quantity by ID
    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by ID or name
    public void search(int choice, String keyword) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if ((choice == 1 && String.valueOf(temp.itemId).equals(keyword)) ||
                (choice == 2 && temp.itemName.equalsIgnoreCase(keyword))) {
                System.out.println("Found: ID=" + temp.itemId + ", Name=" + temp.itemName +
                        ", Quantity=" + temp.quantity + ", Price=" + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    // Total inventory value
    public void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Display all items
    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        System.out.println("\n--- Inventory Records ---");
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.itemName +
                    ", Quantity: " + temp.quantity + ", Price: ₹" + temp.price);
            temp = temp.next;
        }
    }

    // Sort by name or price (ascending or descending)
    public void sortInventory(int key, boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, key, ascending);
        System.out.println("Inventory sorted.");
    }

    private Item mergeSort(Item head, int key, boolean asc) {
        if (head == null || head.next == null) return head;

        Item mid = getMid(head);
        Item nextOfMid = mid.next;
        mid.next = null;

        Item left = mergeSort(head, key, asc);
        Item right = mergeSort(nextOfMid, key, asc);

        return merge(left, right, key, asc);
    }

    private Item getMid(Item head) {
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item merge(Item a, Item b, int key, boolean asc) {
        Item result;
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (key == 1) // Name
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else // Price
            condition = asc ? a.price <= b.price : a.price > b.price;

        if (condition) {
            result = a;
            result.next = merge(a.next, b, key, asc);
        } else {
            result = b;
            result.next = merge(a, b.next, key, asc);
        }
        return result;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n---- Inventory Management ----");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search Item (1-ID / 2-Name)");
            System.out.println("7. Display All Items");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort Inventory (1-Name / 2-Price)");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    Item newItem = new Item(name, id, qty, price);

                    if (choice == 1) inventory.addAtBeginning(newItem);
                    else if (choice == 2) inventory.addAtEnd(newItem);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        inventory.addAtPosition(newItem, pos);
                    }
                }
                case 4 -> {
                    System.out.print("Enter Item ID to Remove: ");
                    inventory.removeById(sc.nextInt());
                }
                case 5 -> {
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int qty = sc.nextInt();
                    inventory.updateQuantity(id, qty);
                }
                case 6 -> {
                    System.out.print("Search by (1-ID / 2-Name): ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    inventory.search(type, keyword);
                }
                case 7 -> inventory.displayAll();
                case 8 -> inventory.totalValue();
                case 9 -> {
                    System.out.print("Sort by (1-Name / 2-Price): ");
                    int key = sc.nextInt();
                    System.out.print("Ascending (true/false): ");
                    boolean asc = sc.nextBoolean();
                    inventory.sortInventory(key, asc);
                }
                case 10 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
