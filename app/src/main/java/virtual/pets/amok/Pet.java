package virtual.pets.amok;

public class Pet {
    private String name;
<<<<<<< Updated upstream
    private String description;
=======
>>>>>>> Stashed changes
    private String oil;
    private String recharge;
    private String feed;
    private String thirst;
    private String waste;
    private String play;

<<<<<<< Updated upstream
    public Pet(String name, String description, String oil, String recharge, String feed, String waste, String play) {
=======
    public Pet(String name, String oil, String recharge, String feed, String waste, String play) {
>>>>>>> Stashed changes
        this.oil = oil;
        this.recharge = recharge;
        this.feed = feed;
        this.waste = waste;
        this.play = play;
        this.name = name;
<<<<<<< Updated upstream
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThirst() {
        return thirst;
    }

    public void setThirst(String thirst) {
        this.thirst = thirst;
=======
>>>>>>> Stashed changes
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
