package virtual.pets.amok;

//dog class extending live pet for cage cleaning
public class Dog extends PetLive {
    /*
     * Adding Clean cage to the dog's super constructor.
     */

    private int cleanCage;

    public int getCleanCage() {
        return cleanCage;
    }

    public void setCleanCage(int cleanCage) {
        this.cleanCage = cleanCage;
    }

    // Need description added to pet, so I can add it here
    public Dog(String name, int feed, int waste, int play, int cleanCage) {
        super(name, 50, 50, 50);
        this.cleanCage = cleanCage;

    }

}
