import java.util.*;
class Main {
    
    public static void Palindrome(String text){
        String reverse = "";
        for(int i=text.length()-1;i>=0;i--){
            reverse+=text.charAt(i);
        }
        if(reverse.equals(text)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String string = input.nextLine().trim();
        
        Palindrome(string);
        

        
        
        
        
        
        
        
    }
}