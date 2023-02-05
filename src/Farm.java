import java.util.Arrays;

public class Farm {


    private String adress;
    private SHeep[] sheeps;
    private Horse[] horses;
    private Cow[] cows;


    public Farm(String adress, SHeep[] sheeps, Horse[] horses, Cow[] cows) {
        this.adress = adress;
        this.sheeps = sheeps;
        this.horses = horses;
        this.cows = cows;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public SHeep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(SHeep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    @Override
    public String toString() {
        return "Farm  {" +
                "adress " + adress + "\n" +
                "sheeps " + Arrays.toString(sheeps) +"\n"+
                "horses " + Arrays.toString(horses) + "\n"+
                "cows " + Arrays.toString(cows) +"\n";

    }


}


