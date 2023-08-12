package virtual.pets.amok;

import java.util.Scanner;

public class PetLive extends Pet {

    Scanner input = new Scanner(System.in);
    public int hunger;
    public int thirst;
    public int waste;
    public int boredom;

    public PetLive(String name, String petDescription, int hunger, boolean feline, int thirst, int waste, int boredom) {
        super(name, petDescription,true,true);
        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.thirst = thirst;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

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
        waste += 5;

    }

    public void hydratePet() {
        thirst -= 5;
        hunger += 2;
        boredom += 2;
        waste += 2;

    }

    public void playPet() {
        thirst += 5;
        hunger += 5;
        boredom -= 10;
        waste -= 3;

    }

    public void tick() {
        if (this.hunger >= 100) {
            this.hunger = 100;
            System.out.println(this.name + " is starving!");
            System.out.println("Press enter to continue");
            input.nextLine();
        } else {
            this.hunger += 10;
        }
        if (this.thirst >= 100) {
            this.thirst = 100;
            System.out.println(this.name + " is parched!");
            System.out.println("Press enter to continue");
            input.nextLine();
        } else {
            this.thirst += 10;
        }
        if (this.boredom >= 100) {
            this.boredom = 100;
            System.out.println(this.name + " is dying of boredom!");
            System.out.println("Press enter to continue");
            input.nextLine();
        } else {
            this.boredom += 10;
        }
    }

    // public void deathTick() {
    //     if (this.hunger >= 100) {
    //         System.out.println(this.name + " has died from starvation...");
    //         System.out.println("Press enter to continue");
    //         input.nextLine();
    //         this.name = "DEAD";
    //     } else if (this.thirst >= 100) {
    //         System.out.println(this.name + " has died from dehydration...");
    //         System.out.println("Press enter to continue");
    //         input.nextLine();
    //         this.name = "DEAD";
    //     } else if (this.boredom >= 100) {
    //         System.out.println(this.name + " has died from dehydration...");
    //         System.out.println("Press enter to continue");
    //         input.nextLine();
    //         this.name = "DEAD";

    //     }
        
    // }
}