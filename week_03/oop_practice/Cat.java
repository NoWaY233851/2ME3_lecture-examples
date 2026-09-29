package week_03.oop_practice;

public class Cat extends Pet{
    protected String breed;

    public Cat(String name, String breed) {
        super(true, "omnivore", "warm", name);
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "This pet's name is " + this.name + ". " +
                "This pet is a " + this.breed + ".";
    }


}
