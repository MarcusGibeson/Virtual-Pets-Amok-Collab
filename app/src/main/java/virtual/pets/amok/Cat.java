package virtual.pets.amok;
//cat class extending live pet for liter box

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

    //Need description added to pet, so I can add it here
    public Cat(String name, int feed, int waste, int play, int literBox) {
        super(name, 50, 50, 50);
        this.literBox = literBox;

    }

}
