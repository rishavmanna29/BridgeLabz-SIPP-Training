import java.util.*;
class MobilePhone{
    private String brand;
    private String model;
    private float price;
    
    public MobilePhone(String brand,String model,float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public void displayInfo(){
        System.out.println("Mobile Info: ");
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
        
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the brand details below: ");
        
        System.out.print("enter brand name: ");
        String brandName = input.nextLine().trim();
        
        System.out.print("enter model name: ");
        String modelName = input.nextLine().trim();
        
        System.out.print("enter the price of the mobile phone: ");
        float mobilePrice = input.nextFloat();
        
        MobilePhone mp = new MobilePhone(brandName,modelName,mobilePrice);
        
        mp.displayInfo();

    }
}