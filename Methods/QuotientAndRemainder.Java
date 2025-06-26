import java.util.*;
class Main {
    public static void QuotientAndRemainder(float n,float k){
        float quotient = n/k;
        float remainder = n%k;
        
        System.out.print("the remainder for the number " + " " + n + " is" + " " + quotient + " and the remainder for the number " + " " + n + " is" + " " + remainder);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter a number:  ");
        float number = input.nextFloat();
        
        System.out.print("enter the divisor:  ");
        float divisor = input.nextFloat();
        
        QuotientAndRemainder(number,divisor);
        
        
    }
}