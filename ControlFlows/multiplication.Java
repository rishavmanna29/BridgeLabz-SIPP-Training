import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 6 and 9: ");
        int number = input.nextInt();
        int counter = 1;
        
        
        while(counter<=number){
            int result=(counter*number);
             System.out.println(number + " *" + counter + " =" + result);
             counter++;
             
        }

        input.close();
    }
}