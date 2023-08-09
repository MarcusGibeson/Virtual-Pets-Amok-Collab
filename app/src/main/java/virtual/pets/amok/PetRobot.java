package virtual.pets.amok;

public class PetRobot extends Pet {

    private int oil;
    private int recharge;
    private int repair;
    private int clean;
    //



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