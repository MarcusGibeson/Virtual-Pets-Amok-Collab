package virtual.pets.amok;
    //dog class extending live pet for cage cleaning
public class Dog extends PetLive {

    private boolean dirtyCage;
    


    public Dog(String name, String petDescription, int hunger, int thirst, int waste, int boredom, boolean dirtyCage) {
        super(name, petDescription, hunger, thirst, waste, boredom);
        this.dirtyCage = dirtyCage;
    
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

    @Override public String toString() {
        return "Name: " + this.name + "\tHunger: " + this.hunger + " / 100 " + "\tThirst: " + this.thirst + " / 100 " + "\tBoredom: " + this.boredom + " / 100 " + "\n\t\tCage dirty? " + this.dirtyCage;
        }
}