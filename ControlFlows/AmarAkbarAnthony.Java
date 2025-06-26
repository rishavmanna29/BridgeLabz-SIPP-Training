import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Amar's age: ");
        int AgeAmar = input.nextInt();
        
        System.out.print("Enter Amar's height: ");
        int HeightAmar = input.nextInt();
        
        System.out.print("Enter Akbar's age: ");
        int AgeAkbar = input.nextInt();
        
        System.out.print("Enter Akbar's height: ");
        int HeightAkbar = input.nextInt();
        
        System.out.print("Enter Anthony's age: ");
        int AgeAnthony = input.nextInt();
        
        System.out.print("Enter Anthony's height: ");
        int HeightAnthony = input.nextInt();
        
        if(AgeAmar<AgeAkbar&&AgeAmar<AgeAnthony){
            System.out.println("Amar's age is the smallest");
        }
        else if(AgeAkbar<AgeAnthony&&AgeAkbar<AgeAmar){
            System.out.println("Akbar's age is the smallest");
        }
        else if(AgeAnthony<AgeAmar&&AgeAnthony<AgeAkbar){
            System.out.println("Anthony's age is the smallest");
        }
        
        if(HeightAmar>HeightAkbar&&HeightAmar>HeightAnthony){
            System.out.println("Amar is the tallest of the three");
        }
        else if(HeightAkbar>HeightAnthony&&HeightAkbar>HeightAmar){
            System.out.println("Akbar is the tallest of the three");
        }
        else if(HeightAnthony>HeightAmar&&HeightAnthony>HeightAkbar){
            System.out.println("Anthony is the tallest of the three");
        }

        input.close();
    }
}
