package virtual.pets.amok;
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
