interface MealPlan {
    void showPlan();
}

class VegetarianMeal implements MealPlan {
    public void showPlan() { System.out.println("Vegetarian Plan: Dal, Rice, Veggies"); }
}

class VeganMeal implements MealPlan {
    public void showPlan() { System.out.println("Vegan Plan: Salad, Tofu, Fruits"); }
}

class KetoMeal implements MealPlan {
    public void showPlan() { System.out.println("Keto Plan: Chicken, Cheese, Eggs"); }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) { this.plan = plan; }

    public void displayMeal() { plan.showPlan(); }
}

public class MealPlanApp {
    public static <T extends MealPlan> void generateMealPlan(T plan) {
        plan.showPlan();
    }

    public static void main(String[] args) {
        VeganMeal vegan = new VeganMeal();
        generateMealPlan(vegan);
    }
}
