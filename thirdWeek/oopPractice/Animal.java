public class Animal {
    protected boolean vertebrate;
    protected String diet;
    protected String bloodType;

    public Animal(boolean vertebrate, String diet, String bloodType) {
        this.vertebrate = vertebrate;
        this.diet = diet;
        this.bloodType = bloodType;
    }

    public Animal(){
        
    }

    @Override
    public String toString() {
        String bloodTypeDescription = this.bloodType.equals("warm") ? "warm-blooded" : "cold-blooded";
        return "This " + bloodTypeDescription + " animal is a " + this.diet + " and " +
                (this.vertebrate ? "a vertebrate." : "an invertebrate.");
    }

}
