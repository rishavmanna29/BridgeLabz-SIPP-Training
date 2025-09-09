interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() { return "Books"; }
}

class ClothingCategory implements Category {
    public String getCategoryName() { return "Clothing"; }
}

class GadgetCategory implements Category {
    public String getCategoryName() { return "Gadgets"; }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void display() {
        System.out.println(name + " | " + category.getCategoryName() + " | ₹" + price);
    }
}

public class MarketplaceApp {
    public static <T extends Category> void applyDiscount(Product<T> product, double percent) {
        product.applyDiscount(percent);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        applyDiscount(book, 10);
        book.display();
    }
}
