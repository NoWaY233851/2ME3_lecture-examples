package week_03.oop_practice;

public class TestAnimal {
    public static void main(String[] args) {
        // Test the Animal class
        Animal animal1 = new Animal(true, "herbivore", "warm");
        Animal animal2 = new Animal(false, "carnivore", "cold");
        
        System.out.println(animal1); 
        System.out.println(animal2);  
        
        // // Test the Pet class
        Pet pet1 = new Pet(true, "herbivore", "warm", "Bunny");
        Pet pet2 = new Pet(false, "omnivore", "cold", "Turtle");
        
        System.out.println(pet1);  
        System.out.println(pet2);  
        
        // Test the Dog class
        Dog dog1 = new Dog("Lab", "Labrador");
        Dog dog2 = new Dog("Bernie", "Bernedoodle");
        
        System.out.println(dog1);  
        System.out.println(dog2);  

    }
}
