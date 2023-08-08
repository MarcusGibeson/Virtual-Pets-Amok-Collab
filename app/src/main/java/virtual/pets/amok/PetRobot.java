package virtual.pets.amok;

public class PetRobot extends Pet {
    // variables init.
    private int oil;
    private int power;
    // int boolean repair;
    // int boolean recharge;

    // super constructor
    public PetRobot(String name, String petDescription, int oil, int power, int repair, int recharge) {
        super(name, petDescription);
        this.oil = oil;
        this.power = power;
        // this.repair = repair;
        // this.recharge = recharge;
    }

    // setters and getters
    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // public boolean isRepair() {
    //     return repair;
    // }

    // public void setRepair(boolean repair) {
    //     this.repair = repair;
    // }

    // public boolean isRecharge() {
    //     return recharge;
    // }

    // public void setRecharge(boolean recharge) {
    //     this.recharge = recharge;
    // }

    // menu actions
    public void oilRobo() {
        oil += 10;
    }

    public void chargeRobo() {
        power = 100;
    }

    public void roboDance() {
        power -= 20;
        oil -= 25;
    }

    public void roboLaser() {
        power -= 35;
        oil -= 15;
    }

    public void needsRepair(){
        if(getOil()<10){
            System.out.println("Robopet needs repair");
        }}

    public void needsCharge(){
            if(getPower()<15)
            System.out.println("Robopet needs to charge");
        }

    }
