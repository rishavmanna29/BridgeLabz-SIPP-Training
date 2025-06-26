import java.util.*;
public class Circle{
    public float radius;
    
    public Circle(float radius){
        this.radius = radius;
    }
    
    public static float areaCalculation(float radius1){
        
        float radius_square = (float)Math.pow(radius1,2);
        
        float area = (float)Math.PI*radius_square;
        return area;
    
    }

    public void displayResult(){
       float store_area_result = areaCalculation(this.radius);
       System.out.print(store_area_result);
    }
}
 
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        float radius1 = input.nextFloat();
        
        Circle circle1 = new Circle(radius1);
        
        System.out.print("the area of the circle is: ");
        circle1.displayResult();

    }
}