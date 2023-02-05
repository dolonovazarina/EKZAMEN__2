public class Person {
    private String name;
    private int age;
    private String horse;

    public Person(String name, int age, String horse) {
        this.name = name;
        this.age = age;
        this.horse = horse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Person  {" +
                "name " + name + "\n" +
                "age  " + age + "\n"+
                "horse " + horse + "\n";
                }
    }

