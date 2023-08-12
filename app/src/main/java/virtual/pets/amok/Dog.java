package virtual.pets.amok;


    //dog class extending live pet for cage cleaning
public class Dog extends PetLive {

    private boolean dirtyCage;
    private int dogPoopCounter;
    private int poopInCage;
    


    public Dog(String name, String petDescription, int hunger, int thirst, int waste, int boredom, boolean dirtyCage) {
        super(name, petDescription, hunger, thirst, waste, boredom);
        this.dirtyCage = dirtyCage;
        this.poopInCage = dogPoopCounter ++;

    
}    
    
    public boolean isDirtyCage() {
        return dirtyCage;
    }

    public void setDirtyCage(boolean dirtyCage) {
        this.dirtyCage = dirtyCage;
    }

    public void useCage() {
        if (this.waste == 40) {
            this.dirtyCage = true;
            this.waste = 0;
            this.poopInCage += 1;
            System.out.println(this.name + " just pooped in their cage.");
        }
    }

    public void cleanCage() {
        if (this.dirtyCage = false) {
            this.poopInCage = 0;
        System.out.println(this.name + "'s cage is now clean!");
    } else {
        System.out.println(this.name + "'s cage doesn't need to be cleaned right now.");
    }
}

    public void dogTick() {

    
        // if (this.dirtyCage = true) {
        //     System.out.println(this.name + " needs their cage cleaned!");
        // }

        if (this.poopInCage == 5) {
            System.out.println(this.name + " needs their cage cleaned!");
        }
    }

    @Override public String toString() {
        return "\nName: " + this.name + "\tHunger: " + this.hunger + " / 100 " + "\tThirst: " + this.thirst + " / 100 " + "\tBoredom: " + this.boredom + " / 100 " + "\n\t\tCage dirty? " + this.dirtyCage;
        }
}
