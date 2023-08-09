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

        public void oilRobot() {
        oil += 10;
        clean -= 2;
    }

    //robot pet actions
        public void roboDance() {
        recharge -= 20;
        oil -= 25;
        repair -=10;
        clean -=5;
        System.out.println("Domo Arigato Mister Roboto!");
    }

    public void roboLaser() {
        recharge -= 35;
        oil -= 15;
        repair -=10;
        System.out.println("Pew-Pew, do not aim for the eyes!");
    }

    //repair and clean methods
    public void repairRobot(){
        oil = 75;
        repair = 75;
        System.out.println("Would you like to apply for a warranty?");
    }
    public void cleanRobot(){
        recharge = 75;
        clean = 75;
        System.out.println("It has the new car smell! ");
    }

    //robot tick method
    public void robTick(){
        recharge -= 4;
        oil -= 2;
        clean -= 7;

        if (oil<=15){
            System.out.println("System Alert: Low oil Detected!");
        }
        if(recharge<=5){
            System.out.println("System Alert : Low Battery, Please Charge!");
        }
                if(repair<=5){
            System.out.println("System Alert : Malfunction Detected!");
        }
                if(clean<=10){
            System.out.println("System Alert : Sensor Block Detected!");
        }

    }

}