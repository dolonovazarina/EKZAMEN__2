public class Horse extends  Animal {
    public Horse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Horse" + getName() + " " + getAge() + " " + getWeight();
    }
}