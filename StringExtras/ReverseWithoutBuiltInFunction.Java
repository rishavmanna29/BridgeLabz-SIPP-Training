import java.util.*;

class Main {
    
    public static void ReverseString(String text){
        String reverse = "";
        for(int i=text.length()-1;i>=0;i--){
            reverse+=text.charAt(i);
        }
        System.out.println(reverse);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String string = input.nextLine().trim();
        
        ReverseString(string);
        
    }
}