import java.util.*;
class Book{
    private String title;
    private String author;
    private float price;
    
    public Book(String title,String author,String price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void displayBookDetails(){
        System.out.println("Book details: ");
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }
    
}
 
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String title1 = input.nextLine().trim();
        
        System.out.println("Enter book author: ");
        String author1 = input.nextLine().trim();
        
        System.out.println("Enter book price: ");
        float price1 = input.nextFloat();
        
        Book book1 = new Book(title1,author1,price1);
        book1.displayBookDetails();

    }
}