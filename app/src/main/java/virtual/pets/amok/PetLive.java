package virtual.pets.amok;

public class PetLive {
    private String name;
    private int hunger;
    private int thirst;

    private int waste;
    private int play;
    private int petID;
    private int petCounter = 1;

    public PetLive(String name, int hunger, int waste, int play) {
        this.hunger = hunger;
        this.waste = waste;
        this.play = play;
        this.name = name;
        this.petID = petCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public void feedPet(){
        hunger -=5;
        thirst +=2;
    }
    public void hydratePet(){
        thirst -=5;
        hunger +=2;
    }
    

}
