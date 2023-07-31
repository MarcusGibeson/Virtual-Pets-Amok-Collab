package virtual.pets.amok;

public class Pet {
    private String name;
    private int oil;
    private int petID;


    public Pet(String name, int oil, int recharge) {
        this.feed = feed;
        this.waste = waste;
        this.play = play;
        this.name = name;
        this.petID = petCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecharge() {
        return recharge;
    }

    public void setRecharge(String recharge) {
        this.recharge = recharge;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }
}