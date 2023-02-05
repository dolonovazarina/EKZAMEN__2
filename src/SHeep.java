public class SHeep extends Animal {
    public SHeep(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public String toString() {
        return "SHeep" + getName() + " " + getAge() + " " + getWeight();
    }


}



