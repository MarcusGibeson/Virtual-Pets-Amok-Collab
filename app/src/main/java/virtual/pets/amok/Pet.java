package virtual.pets.amok;

public abstract class Pet {
    private static int petCounter = 1;
    private int petID;
    public String name;
    public String petDescription;
    private boolean organic;
    private boolean feline;

    public Pet(String name, String petDescription, boolean organic, boolean feline) {
        this.name = name;
        this.petDescription = petDescription;
        this.petID = petCounter++;
        this.organic = organic;
        this.feline = feline;
    }

    public boolean isFeline() {
        return feline;
    }

    public void setFeline(boolean feline) {
        this.feline = feline;

    }

    public boolean isOrganic() {
        return organic;
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

    public void petDescription() {
        System.out.println("Name: " + this.name + "\tDescription: " + this.petDescription + "\tID: " + this.petID);
    }

}
