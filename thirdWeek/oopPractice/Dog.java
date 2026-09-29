public class Dog extends Pet{
    protected String breed;

    public Dog(String name, String breed) {
        super(true, "omnivore", "warm", name);
        this.breed = breed;

        // a hidden field from base class can also be accessed use super.variableName, but cannot be chained
    }


    @Override
    public String toString() {
        // super.toString();
        return "This pet's name is " + this.name + ". " +
                "This pet is a " + this.breed + ".";
    }

}
