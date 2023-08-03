package virtual.pets.amok;

public class PetLive extends Pet{ 
    private int hunger;
    private int thirst;
    private int boredom;

    public PetLive(String name, String petDescription, int hunger,  int thirst, int boredom) {
        super(name, petDescription);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }


    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }


    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void feedPet(){
        hunger -= 10;
        thirst+= 5;
        boredom+=5;
    }
    public void waterPet(){
        hunger +=5;
        thirst-=10;
        boredom+=5;
    }

    @Override public String toString() {
        return "Name: " + this.name + "\tHunger: " + this.hunger  + " / 100" + "\tThirst: " + this.thirst + " / 100" + "Fun: " + this.boredom  + " / 100";
    }



}
