class Animal{
     int age;
     String name; 
    
    public Animal(int age,String name){
        this.age = age;
        this.name = name;
    }
    
    public void makeSound(){
        System.out.println("Sound of the animal of your choice");
    }
}

class Dog extends Animal{
    
    public Dog(int age,String name){
        super(age,name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Woof");  //method overriding from class Animal
    }
}

class Bird extends Animal{
    
    public Bird(int age,String name){
        super(age,name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Chirp"); //method overriding from class Animal
    }
}

class Animals {
    public static void main(String[] args) {
         Dog d = new Dog(12,"bruno");
         Bird b = new Bird(14,"zoey");
         
         d.makeSound();
         b.makeSound();
    }
}