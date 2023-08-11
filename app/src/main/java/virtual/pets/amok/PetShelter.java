package virtual.pets.amok;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetShelter {
    /*
     * Create a hashmap of robots and live pets
     */
    Map<Integer, Pet> shelterAnimals = new HashMap<Integer, Pet>();
    Scanner input = new Scanner(System.in);

    /*
     * Adds pet to shelter
     */

    public void addPet(Pet VirtualPet) throws Exception {
        if (!shelterAnimals.containsKey(VirtualPet.getPetID())) {
            shelterAnimals.put(VirtualPet.getPetID(), VirtualPet);
        } else {
            throw new Exception("Invalid name");
        }
    }

    /*
     * Returns a specific pet
     */
    public Pet getPet(Integer petID) throws Exception {
        if (shelterAnimals.containsKey(petID)) {
            return shelterAnimals.get(petID);
        } else {
            throw new Exception("That pet does not exist in the shelter!");
        }
    }

    /*
     * Returns a collection of pets
     */
    public void showAllPets() {
        System.out.println();
        System.out.println();
        System.out.println("VIRTUAL PET SHELTER: PET'S STATUS");
        System.out.println("-----------------------------------------------------------------------------");
        for (Integer pet : shelterAnimals.keySet()) {
            System.out.println(shelterAnimals.get(pet));
            System.out.println();

        }
    }

    /*
     * Find pet method to get name from pet values
     */

    private Pet findPet(String name) {
        for (Pet pet : shelterAnimals.values()) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    /*
     * Removes a specific pet
     */
    public void adoptPet(String name) throws Exception {
        Pet pet = findPet(name);
        if (pet != null) {
            shelterAnimals.remove(pet.getPetID());
        } else {
            throw new Exception("That pet does not exist in the shelter");
        }
    }

    /*
     * feeds all pets
     */
    public void feedAllPets() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetLive) {
                ((PetLive) pet).feedPet();
                System.out.println(pet.getName() + " has been fed.");
            }
        }
    }

    /*
     * hydrates all pets
     */
    public void waterAllPets() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetLive) {
                ((PetLive) pet).hydratePet();
                System.out.println(pet.getName() + " has been hydrated.");
            }
        }
    }

    /*
     * Plays with one specific pet
     */
    public void playWithPet() throws Exception {
        System.out.println("Select a Pet: ");
        for (Pet pet : shelterAnimals.values()) {
            findPet(input.nextLine());
            if (pet instanceof PetLive) {
                ((PetLive) pet).playPet();
                System.out.println(pet.getName() + " had fun!");
            }
        }
    }

/*
 * Picking a cat's litter box to change
 */
    public void cleanSingleLitter() {
        System.out.println("Select a Cat");
        for (Pet pet : shelterAnimals.values()) {
            findPet(input.nextLine()); // Make a Cat List?
            if (pet instanceof Cat) {
                ((Cat) pet).cleanLitter();

            }
        }

    }

    /*
     * Picking a dog cage to clean
     */
    public void cleanSingleCage() {
        System.out.println("Select a Dog");
        for (Pet pet : shelterAnimals.values()) {
            findPet(input.nextLine()); // Make a Dog List?
            if (pet instanceof Dog) {
                ((Dog) pet).cleanCage();
            }
        }

    }

    public void tickAll() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetLive) {
                ((PetLive) pet).tick();
                ((PetLive) pet).deathTick();
                if (pet instanceof Cat) {
                    ((Cat) pet).catTick();
                } else if (pet instanceof Dog) {
                    ((Dog) pet).dogTick();
                }
            }
            else if (pet instanceof PetRobot) {
            ((PetRobot) pet).robTick();
            }
        }
        Pet pet = findPet("DEAD");
        shelterAnimals.remove(pet.getPetID());

    }

    /*
     * Remove robots
     */
    public void removePet(int bye) throws Exception {
        Pet pet = getPet(bye);
        shelterAnimals.remove(pet.getPetID());
    }

    /*
     * oil all robot pets
     */
    public void oilAllPets() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).oilRobot();
                System.out.println(pet.getName() + " has been oiled.");
            }
        }
    }

    /*
     * charge all robot pets
     */
    public void chargeAllPets() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).chargeRobot();
                System.out.println(pet.getName() + " has been oiled.");
            }
        }
    }

    /*
     * repair all robot pets
     */
    public void repairAllPets() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).repairRobot();
                System.out.println(pet.getName() + " is all set.");
            }
        }
    }

    /*
     * clean all robot pets
     */
    public void cleanAllPets() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).repairRobot();
                System.out.println(pet.getName() + " is all set.");
            }
        }
    }
}
