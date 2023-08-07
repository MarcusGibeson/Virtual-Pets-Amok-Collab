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

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    @Override public String toString() {
        return "Name: " + this.name + "\tHunger: " + this.feed  + " / 100" + "\tThirst: " + this.thirst + " / 100" + "Fun: " + this.play  + " / 100";
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
