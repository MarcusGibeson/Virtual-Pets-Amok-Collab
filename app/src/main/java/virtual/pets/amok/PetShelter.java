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

    // private String findAPet(String testName){

    // for (Pet name : shelterAnimals.values()) {
    // if (name.getName().equals(testName)) {
    // return name;
    // }else{
    // String not = "Not found";
    // }
    // return not;

    // }}

    private Pet findPet(String name) throws Exception {
        for (Pet pet : shelterAnimals.values()) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
        // return findPet(name);
        // throw new Exception ("Pet could not be found.");
    }
    /*
     * /* Show pet descriptions
     */

    public void showDescriptions() {
        for (Pet pet : shelterAnimals.values()) {
            pet.petDescription();
        }
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
                System.out.println();
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

        System.out.println("Which pet would you like to play with? ");
        for (Pet pet : shelterAnimals.values()) {
            String chosenPet = input.nextLine();
            Pet truePet = findPet(chosenPet);
            if (truePet.isOrganic()) {
            if (truePet != null) {
                ((PetLive) truePet).playPet();
                System.out.println(truePet.getName() + " had fun!!!!");
            } 
            return;
        }
        return;
        }
        return;

    }

    // public void playWith() throws Exception {
    // System.out.println("What pet would you like to play with?");
    // String chosenPet = input.nextLine();
    // if (shelterAnimals.containsKey(chosenPet)) {
    // String value = shelterAnimals.get(chosenPet).playWithPet();
    // System.out.println(value);
    // input.nextLine();
    // } else {
    // throw new Exception ("That pet does not exist in the shelter.");
    // }

    // }

    /*
     * Picking a cat's litter box to change
     */
    public void cleanSingleLitter() throws Exception {
        System.out.println("Select a Cat's litter box to clean.");
        for (Pet pet : shelterAnimals.values()) {
            String chosenPet = input.nextLine();
            Pet truePet = findPet(chosenPet);
            if (truePet instanceof PetLive) {
                if ((truePet != null)) {
                    ((Cat) truePet).cleanLitter(truePet.isFeline());
                }
            else
                System.out.println("that pet does not have a litter box");
            }
            return;
        }
    }

    /*
     * Picking a dog cage to clean
     */
    public void cleanSingleCage() throws Exception {
        System.out.println("Select a Dog's cage to clean.");
        for (Pet pet : shelterAnimals.values()) {
            String chosenPet = input.nextLine();
            Pet truePet = findPet(chosenPet);
            if (truePet instanceof PetLive) {
                if ((truePet != null)) {
                    ((Dog) truePet).cleanCage(truePet.isFeline());
                }
            } else {
                System.out.println("that pet does not have a cage");
            }

            return;

        }
    }

    public void tickAll() {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof Dog) {
                ((PetLive) pet).tick();
                // ((PetLive) pet).deathTick();
                if (pet instanceof Cat) {
                    ((Cat) pet).catTick();
                } else if (pet instanceof Dog) {
                    ((Dog) pet).dogTick();
                }
            } else if (pet instanceof PetRobot) {
                ((PetRobot) pet).robTick();
            }
        }
        // Pet pet = findPet("DEAD");
        // shelterAnimals.remove(pet.getPetID());

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
                ((PetRobot) pet).cleanRobot();
                System.out.println(pet.getName() + " is all set.");
            }
        }
    }

    /*
     * all robot pets dance
     */
    public void allDance() throws Exception {
        for (Pet pet : shelterAnimals.values()) {
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).robotDance();
                // System.out.println(pet.getName() + " has been oiled.");
            }
        }
    }

    /*
     * all robot pets shoots lasers
     */
    public void allLaser() {
        for (Pet pet : shelterAnimals.values()) {
            System.out.println("Pew-Pew, do not aim for the eyes!");
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).robotLaser();
                // System.out.println(pet.getName() + " has been oiled.");
            }
        }
    }
}
