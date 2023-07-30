package virtual.pets.amok;

public class PetLive {
    private String name;
    private int feed;
    private int waste;
    private int play;
    private int petID;

    public PetLive(String name, int feed, int waste, int play) {
        this.feed = feed;
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


    public String getFeed() {
        return feed;
    }

    public void setFeed(int feed) {
        this.feed = feed;
    }

    public String getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

}
