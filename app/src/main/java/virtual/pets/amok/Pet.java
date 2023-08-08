package virtual.pets.amok;

public class Pet {
    private static int petCounter = 1;
    private int petID;
    public String name;
    public String petDescription;
    public int hunger;
    public int thirst;
    public int waste;
    public int boredom;
    private int oil;
    private int power;
    private boolean repair;
    private boolean recharge;
    private int litterBox;
    private boolean dirtyCage;

    //robot constructor
    public Pet(String name, String petDescription, int oil, int power, boolean repair, boolean recharge) {
        this.name = name;
        this.petDescription = petDescription;
        this.petID = petCounter++;
        this.oil = oil;
        this.power = power;
        this.repair = repair;
        this.recharge = recharge;
    }

    //cat constructor
    public Pet(String name, String petDescription, int hunger, int thirst, int waste, int boredom, int litterBox) {
        this.name = name;
        this.petDescription = petDescription;
        this.petID = petCounter++;
        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.thirst = thirst;
        this.litterBox = litterBox;
    }
    //dog constructor
    public Pet(String name, String petDescription, int hunger, int thirst, int waste, int boredom, boolean dirtyCage) {
        this.name = name;
        this.petDescription = petDescription;
        this.petID = petCounter++;
        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.thirst = thirst;
        this.dirtyCage = dirtyCage;
    
}    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetID() {
        return petID;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

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

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    public boolean isRecharge() {
        return recharge;
    }

    public void setRecharge(boolean recharge) {
        this.recharge = recharge;
    }

    public boolean isDirtyCage() {
        return dirtyCage;
    }

    public void setDirtyCage(boolean dirtyCage) {
        this.dirtyCage = dirtyCage;
    }

    public void useCage() {
        if (this.waste == 100) {
            this.dirtyCage = true;
            this.waste = 0;
            System.out.println(this.name + " just pooped in their cage.");
        }
    }

    public void cleanCage() {
        this.dirtyCage = false;
        System.out.println(this.name + "'s cage is now clean!");
    }


    public int getLitterBox() {
        return litterBox;
    }

    public void setLitterBox(int litterBox) {
        this.litterBox = litterBox;
    }

    public void useLitterBox() {
        if (this.waste == 100) {
            this.litterBox++;
            this.waste = 0;
            System.out.println(this.name + " just used the litter box.");
        }
    }

    public void cleanLitter() {
        this.litterBox = 0;
        System.out.println("The litterbox is now clean.");
    }
    // menu actions

    public void feedPet() {
        hunger -= 5;
        thirst += 2;
        boredom += 2;
    }

    public void hydratePet() {
        thirst -= 5;
        hunger += 2;
        boredom += 2;
    }

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

    public void needsRepair() {
        if (getOil() < 10) {
            System.out.println("Robopet needs repair");
        }
    }

    public void needsCharge() {
        if (getPower() < 15)
            System.out.println("Robopet needs to charge");
    }

}
