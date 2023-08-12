package virtual.pets.amok;

public class PetRobot extends Pet {

    private int oil;
    private int recharge;
    private int repair;
    private int dirty;
    //

    public PetRobot(String name, String petDescription, int oil, int recharge, int repair, int dirty) {
        super(name, petDescription,false,false);
        this.oil = oil;
        this.recharge = recharge;
        this.repair = repair;
        this.dirty = dirty;
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

    public int getDirty() {
        return dirty;
    }

    public void setDirty(int dirty) {
        this.dirty = dirty;
    }

    // robot pet actions
    public void oilRobot() {
        oil -= 10;
        dirty += 5;
        System.out.println("You spilled oil on " + this.name + ".");
    }

    public void chargeRobot() {
        recharge -= 20;
        repair -= 4;
        oil += 1;
        if (recharge < 60) {
            System.out.println("Be careful not to overcharge " + this.name + ".");
        }
    }

    public void robotDance() throws Exception {
        Thread.sleep(1000);
        System.out.println("Robots are syncing up. . .");
        Thread.sleep(1000);
        recharge += 20;
        oil += 25;
        repair += 10;
        dirty += 5;
        System.out.println("Domo Arigato Mister Roboto!");
    }

    public void robotLaser() {
        recharge += 35;
        oil += 15;
        repair += 10;
        // System.out.println("Pew-Pew, do not aim for the eyes!");
    }

    // repair and clean methods
    public void repairRobot() {
        oil = 25;
        repair = 25;
        System.out.println("Would you like to apply for a warranty?");
    }

    public void cleanRobot() {
        recharge = 25;
        dirty = 25;
        System.out.println("It has the new car smell! ");
    }

    // robot tick method
    public void robTick() {
        this.recharge += 4;
        this.oil += 2;
        this.dirty += 7;

        if (this.oil >= 85) {
            System.out.println(this.name + " System Alert: Low oil Detected!");
        }
        if (this.recharge >= 85) {
            System.out.println(this.name + " System Alert : Low Battery, Please Charge!");
        }
        if (this.repair >= 85) {
            System.out.println(this.name + " System Alert : Malfunction Detected!");
        }
        if (this.dirty >= 80) {
            System.out.println(this.name + " System Alert : Sensor Block Detected!");
        }

    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\tOil " + this.oil + " / 100 " + "\tBattery: " + this.recharge + " / 100 "
                + "\tDamage: " + this.repair + " / 100 " + "\n\t\tCleanliness: " + this.dirty + " / 100";
    }

    // public void deathRobotTick() {
    //     if (this.repair == 0) {
    //         System.out.println(this.name + " Robot is Damaged beyond Repair. Please take to Nearest Recycle Center");
    //         // System.out.println("Press enter to continue");
    //         // input.nextLine();
    //     } else if (this.clean == 0) {
    //         System.out.println(this.name
    //                 + " is completely rusted, To0 much money to restore. Please take to Nearest Recycle Center");
    //         // System.out.println("Press enter to continue");
    //         // input.nextLine();
    //     }
    //     this.name = "DEAD";
    // }
}