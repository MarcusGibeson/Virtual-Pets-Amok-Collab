package virtual.pets.amok;

public class Pet {
    private static int petCounter = 1;
    private String name;
    private int petID;
    private String petDescription;

    public Pet(String name, String petDescription) {
        this.name = name;
        this.petDescription = petDescription;
        this.petID = petCounter++;
    }
    
    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
