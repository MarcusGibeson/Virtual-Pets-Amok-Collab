package virtual.pets.amok;

<<<<<<< Updated upstream
public class PetLive extends pet { //this should extend Pet
    private String name;
    private int feed;
    private int waste;
    private int play;
    private int petID; // this should be in Pet with Getters and Setters

    public PetLive(String name, int feed, int waste, int play) {
        this.feed = feed;
        this.waste = waste;
        this.play = play;
        this.name = name;
        this.petID = petCounter++; // this should be in Pet constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getFeed() {
        return feed;
=======
public class PetLive { //this should extend Pet
    private String name;
    private int hunger;
    private int thirst;

    private int waste;
    private int boredom;


    public PetLive(String name, int hunger, int waste, int boredom) {
        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.name = name;
         // this should be in Pet constructor
    }

    public String getName() {
        return name;
>>>>>>> Stashed changes
    }

    public void setName(String name) {
        this.name = name;
    }
<<<<<<< Updated upstream

    public String getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public String getPlay() {
        return play;
=======
    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
>>>>>>> Stashed changes
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

<<<<<<< Updated upstream
=======
    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setPlay(int boredom) {
        this.boredom = boredom;
    }

    public void feedPet(){
        hunger -=5;
        thirst +=2;
        boredom +=2;
    }
    public void hydratePet(){
        thirst -=5;
        hunger +=2;
        boredom +=2;
    }
    

>>>>>>> Stashed changes
}
