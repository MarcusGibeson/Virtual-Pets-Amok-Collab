package virtual.pets.amok;
 
public class Cat extends PetLive {
    /*
     * Adding Liter Box to cat's super constructor.
     */

    private int literBox;

    public int getLiterBox() {
        return literBox;
    }

    public void setLiterBox(int literBox) {
        this.literBox = literBox;
    }

    public Cat(String name,String description, int feed, int waste, int play, int literBox) {
        super(name, description, 50, 50, 50); //Need to add "description" on pet class  
        this.literBox = literBox;

    }

}