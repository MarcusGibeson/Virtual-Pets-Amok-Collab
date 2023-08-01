package virtual.pets.amok;

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

    public Dog(String name, int feed, int waste, int play, int cleanCage) {
        super(name, 100, 100, 100);
        this.cleanCage = cleanCage;

    }

}
