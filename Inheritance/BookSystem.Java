import java.util.*;
class Book{
    private String title;
    private int publicationYear;
    
    public Book(String title,int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
        
    }
    
    public void displayInfo(){
        System.out.print("the book details are as follows: ");
        System.out.println("title: " + title);
        System.out.println("publication year: " + publicationYear);
        
    }
    
}

class Author extends Book{
    private String authorName;
    private String bookBio;
    
    public Author(String title,int publicationYear,String authorName,String bookBio){
        super(title,publicationYear);
        this.authorName = authorName;
        this.bookBio = bookBio;
        
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("author name: " + authorName);
        System.out.println("book bio: " + bookBio);
    }
}

class BookSystem{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of book you want in the system: ");
        
        int numberOfBooks = input.nextInt();
        
        Author[] au = new Author[numberOfBooks];
        
        for(int i =0;i<numberOfBooks;i++){
            
            System.out.println("enter the details for book: " + (i+1) + "   ");
            
            System.out.println("enter the book title: ");
            String title1 = input.nextLine();
            
            System.out.println("enter the book publication year: ");
            String publicationYear1 = input.nextInt();
            
            System.out.println("enter the book author: ");
            String authorName1 = input.nextLine();
            
            System.out.println("enter the book bio: ");
            String bookBio1 = input.nextLine();
            
            au[i] = new Author(title1,publicationYear1,authorName1,bookbio1);
            
            
        }
        
        for(Author a : au){
            a.displayInfo();
            System.out.println();
        }
        
        input.close();
    }
}
