package virtual.pets.amok;

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



}
