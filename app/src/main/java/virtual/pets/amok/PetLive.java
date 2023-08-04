package virtual.pets.amok;

<<<<<<< Updated upstream
public class PetLive extends pet { //this should extend Pet
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
    }

    public void setName(String name) {
        this.name = name;
    }
<<<<<<< HEAD


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
=======
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
>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

<<<<<<< HEAD
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

=======
    public int getBoredom() {
        return boredom;
    }

    public void setPlay(int boredom) {
        this.boredom = boredom;
    }

>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
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
    

<<<<<<< HEAD
>>>>>>> Stashed changes
=======
>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
}
