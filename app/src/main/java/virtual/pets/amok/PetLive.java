package virtual.pets.amok;

public class PetLive extends Pet{ //this should extend Pet
    private int feed;
    private int waste;
    private int play;

    public PetLive(String name, String petDescription, int feed, int waste, int play) {
        super(name, petDescription);
        this.feed = feed;
        this.waste = waste;
        this.play = play;
    }


    public int getFeed() {
        return feed;
    }

    public void setFeed(int feed) {
        this.feed = feed;
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

}
