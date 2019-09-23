public class Dog implements Comparable<Dog> {

    private String name;
    private double weight;


    // CONSTRUCTOR
    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    // (setter)
    public void setName(String n) {
        this.name = n;
    }


    // (setter)
    public void setWeight(double w) {
        this.weight = w;
    }


    // (getter)
    public String getName() {
        return this.name;
    }


    // (getter)
    public double getWeight() {

        return this.weight;
    }



    // overriden from interface, Comparable 
    public int compareTo(Dog otherDog){

        if (this.weight - otherDog.getWeight() < 0.0)
            return -1;
        else if (this.weight - otherDog.getWeight() > 0.0)
            return 1;
        return 0;
    }


    // overriden from class, Object
    public String toString() {
        return name + ", weight: " + weight;
    }

}
