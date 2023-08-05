package virtual.pets.amok;
<<<<<<< HEAD

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

    public Dog(String name, String description, int feed, int waste, int play, int cleanCage) {
        super(name, description, feed, waste, play);
        this.cleanCage = cleanCage;

    }

}
=======
    //dog class extending live pet for cage cleaning
public class Dog extends PetLive {

    private boolean dirtyCage;
    


    public Dog(String name, String petDescription, int hunger, int thirst, int waste, int boredom, boolean dirtyCage) {
        super(name, petDescription, hunger, thirst, waste, boredom);
        this.dirtyCage = dirtyCage;
    
}    
    
    public boolean isDirtyCage() {
        return dirtyCage;
    }

    public void setDirtyCage(boolean dirtyCage) {
        this.dirtyCage = dirtyCage;
    }
}
>>>>>>> ad8f35fe053c9c3962e767d59c0b94c79586bc94
