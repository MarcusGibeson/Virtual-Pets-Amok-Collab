package virtual.pets.amok;

public class Pet {
    private String name;
    private int oil;
    private int recharge;
    private int feed;
    private int waste;
    private int play;
    private int petID;

    public Pet(String name, int oil, int recharge, int feed, int waste, int play) {
        this.oil = oil;
        this.recharge = recharge;
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

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getRecharge() {
        return recharge;
    }

    public void setRecharge(String recharge) {
        this.recharge = recharge;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getWaste() {
        return waste;
    }

    public void setWaste(String waste) {
        this.waste = waste;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

}
