package virtual.pets.amok;

public class PetRobot extends Pet {

    private int oil;
    private int recharge;
    private int repair;
    private int clean;



    public PetRobot(String name, String petDescription, int oil, int recharge, int repair, int clean) {
        super(name, petDescription);
        this.oil = oil;
        this.recharge = recharge;
        this.repair = repair;
        this.clean = clean;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getRecharge() {
        return recharge;
    }

    public void setRecharge(int recharge) {
        this.recharge = recharge;
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }
        public int getClean() {
        return clean;
    }

    public void setClean(int clean) {
        this.clean = clean;
    }
}