import java.util.*;
public class Main {
    
    public static void CompareStrings(String s,String t){
        
        if(s.length()!=t.length()){
            System.out.print("the two strings are not equal");
            return;
        }
        
        
        for(int i=0;i<s.length();i++){
            
                
                if(s.charAt(i)!=t.charAt(i)){
                    System.out.print("the two strings are not equal");
                    return;
                }
                
       
                
               
        }
        System.out.println("the two strings are equal");
    }
    
    
    public static boolean StringEqual(String s,String t){
        
             if(s.equals(t)){
                 return true;
             }
             
             else{
                 return false;
             }
    }
             
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    System.out.print("enter first string: ");
    String str1 = input.nextLine().trim();
    
    System.out.print("enter second string: ");
    String str2 = input.nextLine().trim();
    
    CompareStrings(str1,str2);
    
    StringEqual(str1,str2);
        
    }
        
}
    
