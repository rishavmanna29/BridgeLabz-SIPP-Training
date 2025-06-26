import java.util.*;
class Main {
    
    public static String CharArray(String text){
        String result1 = "";
        for(int i =0;i<text.length();i++){
            result1+=text.charAt(i);
            
        }
        return result1;
    }
    
    public static String BuiltIn(String text){
        
        String result2 = "";
        char[] ch = text.toCharArray();
        for (char c:ch){
            result2+=c;
        }
        return result2;
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String string = input.nextLine().trim();
        
        String final1 = CharArray(string);
        String final2 = BuiltIn(string);
        
        
        System.out.println("result from the first method: " + " " + final1);
        System.out.println("result from the second method: " + " " + final2);
        
        if(final1.equals(final2)){
            System.out.println("true");
        }
        
        
        
        
    }
}