package virtual.pets.amok;

<<<<<<< HEAD
public class PetLive extends Pet{ 
    private int feed;
    private int thirst;
    private int play;

    public PetLive(String name, String petDescription, int feed,  int thirst, int play) {
        super(name, petDescription);
        this.feed = feed;
        this.thirst = thirst;
        this.play = play;
    }


    public int getFeed() {
        return feed;
    }

    public void setFeed(int feed) {
        this.feed = feed;
    }

=======
public class PetLive extends Pet { // this should extend Pet

    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;

    public PetLive(String name, String petDescription, int hunger, int thirst, int waste, int boredom) {
        super(name, petDescription);
        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.thirst = thirst;
    }

>>>>>>> ad8f35fe053c9c3962e767d59c0b94c79586bc94
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


<<<<<<< HEAD
=======
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
>>>>>>> ad8f35fe053c9c3962e767d59c0b94c79586bc94

}
