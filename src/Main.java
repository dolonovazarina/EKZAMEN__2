import javax.naming.Name;

public class Main {
    public static void main(String[] args) {


        Cow cow = new Cow(" Aiss ", 10, 50.5);
        Cow cow2 = new Cow(" Ais ", 8, 25.4);
        Cow cow3 = new Cow(" Ass ", 6, 20.2);

        Horse horse = new Horse("  Toss ", 10, 550.2);
        Horse horse2 = new Horse(" Torro ", 10, 500.3);
        Horse horse3 = new Horse(" Toru ", 10, 555.4);

        SHeep sHeep = new SHeep("  Zuza " , 3 , 15.8 );
        SHeep sHeep2 = new SHeep("  Zusi ", 3, 10.7);
        SHeep sHeep3 = new SHeep("  Zia  ", 3, 16.6);

        Person person = new Person("  Bek ", 70, " Tulpar  ");
        System.out.println();
        Cow[] cows = {cow, cow2, cow3};
        System.out.println();
        Horse[] horses = {horse, horse2, horse3};
        System.out.println();
        SHeep[] sHeeps = {sHeep, sHeep2, sHeep3};
        System.out.println();

        Farm farm = new Farm("   Moscow", sHeeps, horses, cows);


        System.out.println(farm);
        System.out.println();
        System.out.println(person);


    }


}