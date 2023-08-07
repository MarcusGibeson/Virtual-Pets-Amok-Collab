package virtual.pets.amok;

public class PetLive extends Pet { // this should extend Pet

    public int hunger;
    public int thirst;
    public int waste;
    public int boredom;

    public PetLive(String name, String petDescription, int hunger, int thirst, int waste, int boredom) {
        super(name, petDescription);
        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.thirst = thirst;
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

}
