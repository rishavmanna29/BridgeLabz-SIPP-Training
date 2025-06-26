import java.util.*;
class Main {
    
    public static String SubString(String text,int i,int j){
        String result = "";
        for(int k = i ;k<j;k++){
            char ch = text.charAt(k);
            result+=ch;
        }
        
        return result;
    }
    
    public static String SubString2(String text,int i,int j){
        String Substring = text.substring(i,j);

        return Substring;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String string = input.nextLine().trim();
        
        System.out.print("enter the starting index of the substring: ");
        int StartIndex = input.nextInt();
        
        System.out.print("enter the last index of the substring: ");
        int LastIndex = input.nextInt();
        
        if(StartIndex<0 || LastIndex>(string.length()-1)){
            System.out.print("Sorry you have entered the wrong indices. Enter indices between 0 and length of the string - 1. Program exiting...");
            return;
        }
        
        System.out.println(SubString(string,StartIndex,LastIndex));
        System.out.println(SubString2(string,StartIndex,LastIndex));
        
        
        
        String result1 = SubString(string,StartIndex,LastIndex);
        String result2 = SubString2(string,StartIndex,LastIndex);
        
        
        if(result1.equals(result2)){
            System.out.print("true");
            
        }
        
        else{
            System.out.print("false");
        }
        
        
    }
}