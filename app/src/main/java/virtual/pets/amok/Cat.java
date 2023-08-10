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

    public void useLitterBox() {
        if (this.waste == 100) {
            this.litterBox = true;
            this.waste = 0;
            System.out.println(this.name + " just used the litter box.");
        }
    }

    public void cleanLitter() {
        this.litterBox = false;
        System.out.println("The litter box is now clean.");
    }


    public void catTick() {
        hunger -= 3;
        thirst += 1;
        boredom += 3;

        if (this.waste >= 50) { //How to make this prompt, when cat uses the litter box 3 times?
            System.out.println(this.name + " needs their litter box changed.");
        }

    }


    @Override
    public String toString() {
        return "\nName: " + this.name + "\tHunger: " + this.hunger + " / 100 " + "\tThirst: " + this.thirst + " / 100 "
                + "\tBoredom: " + this.boredom + " / 100 " + "\n\t\tLitter box dirty? " + this.litterBox;
    }
}
