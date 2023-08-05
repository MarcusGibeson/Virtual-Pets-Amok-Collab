package virtual.pets.amok;

public abstract class Pet {
    private static int petCounter = 1;
    private int petID;
    private String name;
    private String petDescription;

    public Pet(String name, String petDescription) {
        this.name = name;
        this.petDescription = petDescription;
        this.petID = petCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetID() {
        return petID;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }



}
