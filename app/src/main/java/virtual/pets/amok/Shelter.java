package virtual.pets.amok;

public class Shelter {
    private String name;
    private String oil;
    private String recharge;
    private String feed;
    private String waste;
    private String play;

    public Shelter(String name, String oil, String recharge, String feed, String waste, String play) {
        this.oil = oil;
        this.recharge = recharge;
        this.feed = feed;
        this.waste = waste;
        this.play = play;
        this.name = name;
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
