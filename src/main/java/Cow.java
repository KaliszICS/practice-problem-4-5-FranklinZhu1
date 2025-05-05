public class Cow {
    
    /**
     * A class to describe a cow with a name, age, and weight.
     */

    private String name;
    private int age;
    private double weight;

    /**
     * A constructor to assign the cow's name, age, and weight, given all three parameters.
     * 
     * @param name the cow's name
     * @param age the cow's age
     * @param weight the cow's weight
     */

    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * A getter method to return the name of the cow.
     * 
     * @return the name of the cow
     */

    public String getName() {
        return this.name;
    }

    /**
     * A getter method to return the age of the cow.
     * 
     * @return the age of the cow
     */

    public int getAge() {
        return this.age;
    }

    /**
     * A getter method to return the weight of the cow.
     * 
     * @return the weight of the cow
     */

    public double getWeight() {
        return this.weight;
    }

    /**
     * A method to override the default toString() that returns the cow's name, age, and weight in a specific format.
     * 
     * @return "name, age - weight"
     */

    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.weight;
    }

    /**
     * A method to override the default equals() that returns true if both cows have the same name, age, and weight.
     * 
     * @param obj the second cow to compare to the constructed one
     * @return true if the cows have the same name, age, and weight, false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Cow c = (Cow) obj;
        if (c.name.equals(this.name) && c.age == this.age && c.weight == this.weight) return true;
        return false;
    }

}
