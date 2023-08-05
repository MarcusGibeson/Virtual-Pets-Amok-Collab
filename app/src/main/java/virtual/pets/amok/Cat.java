package virtual.pets.amok;

//cat class extending live pet for liter box
public class Cat extends PetLive {

    private Boolean litterBox;

    public Cat(String name, String petDescription, int hunger, int thirst, int waste, int boredom, boolean litterBox) {
        super(name, petDescription, hunger, thirst, waste, boredom);
        this.litterBox = litterBox;
    }

    public Boolean getLitterBox() {
        return litterBox;
    }

    public void setLitterBox(Boolean litterBox) {
        this.litterBox = litterBox;
    }
}
