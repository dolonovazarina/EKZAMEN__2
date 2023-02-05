public class Cow extends Animal {
    public Cow(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cow"+getName()+ " "+getAge()+ " "+getWeight();
    }
}

