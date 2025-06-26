import java.util.*;
public class Main {
    
    static void NumberFormatexception(String text){
        int number = Integer.parseInt(text);
    }
    
    static void HandleException(String text){
        try{
            int number = Integer.parseInt(text);
             System.out.println("Converted number: " + number);
        
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException" + " " + text);
        }
        catch(RuntimeException e){
              System.out.println("A runtime exception occurred.");
        }
    }
    public static void main(String[] args) {
        System.out.print("enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        HandleException(str);
        NumberFormatexception(str);
        
        
    
    }
}
