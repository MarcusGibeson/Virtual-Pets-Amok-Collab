package virtual.pets.amok;

public class PetRobot extends Pet {

    private int oil;
    private int recharge;
    private int repair;

    public PetRobot(String name, String petDescription, int oil, int recharge, int repair) {
        super(name, petDescription);
        this.oil = oil;
        this.recharge = recharge;
        this.repair = repair;
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
}