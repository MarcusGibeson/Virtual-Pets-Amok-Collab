package virtual.pets.amok;

//cat class extending live pet for liter box
public class Cat extends PetLive {

    private Boolean litterBox;
    private int poopCounter;
    private int poopInBox;
    

    public Cat(String name, String petDescription, int hunger, int thirst, int waste, int boredom, boolean litterBox) {
        super(name, petDescription, hunger, true, thirst, waste, boredom);
        this.litterBox = litterBox;
        this.poopInBox = poopCounter++;
        
    }

    public Boolean getLitterBox() {
        return litterBox;
    }

    public void setLitterBox(Boolean litterBox) {
        this.litterBox = litterBox;
    }

    public void useLitterBox() {
        if (this.waste >= 25) {
            this.waste = 0;
            this.poopInBox++;
            System.out.println(this.name + " just used the litter box.");
        }
    }

    public void cleanLitter(boolean feline) {
        if(feline){
        if (this.litterBox = true) {
            this.poopInBox = 0;
            System.out.println(this.name + "'s litter box is now clean.");
        } else {
            System.out.println(this.name + "'s litter box doesn't need to be cleaned right now.");
        }
        }
    }

    public void catTick() {
        this.waste += 5;
        useLitterBox();

        // if (this.litterBox = true) {
        // System.out.println(this.name + " needs their litter box changed!");
        // }

        if (this.poopInBox >= 3) {
            this.litterBox = true;
            System.out.println(this.name + " needs their litter box changed!");
        }
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\tHunger: " + this.hunger + " / 100 " + "\tThirst: " + this.thirst + " / 100 "
                + "\tBoredom: " + this.boredom + " / 100 " + "\n\t\tLitter box dirty? " + this.litterBox + "\t\t Waste "
                + this.waste;
    }
}
