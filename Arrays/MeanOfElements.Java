import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of players: ");
        int players = input.nextInt();
        
        System.out.println("enter the height of the" + " " + players + " players: ");
        
        double[] arr = new double[players];
        int sum = 0;

        for(int i=0;i<players;i++){
            arr[i] = input.nextDouble();
        }

        
        for(int i=0;i<players;i++){
            sum+=arr[i];
        }
        double mean = sum/players;
        System.out.print("the mean of the elements in the array is: " + mean);
        
        
        
        
        

        input.close();
    }
}
