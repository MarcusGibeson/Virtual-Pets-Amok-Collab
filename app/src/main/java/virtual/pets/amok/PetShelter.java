package virtual.pets.amok;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetShelter {
    /*
     * Create a hashmap of robots and live pets
     */
    Map <Integer, Pet> shelterAnimals = new HashMap<Integer, Pet>();
    Scanner input = new Scanner(System.in);
    
    /*
     * Adds pet to shelter
     */

    public void addPet(Pet VirtualPet) throws Exception {
        if(!shelterAnimals.containsKey(VirtualPet.getPetID())) {
            shelterAnimals.put(VirtualPet.getPetID(), VirtualPet);
        } else {
            throw new Exception ("Invalid name");
        }
    }

    /*
     * Returns a specific pet
     */
    public Pet getPet(Integer petID) throws Exception {
        if (shelterAnimals.containsKey(petID)) {
            return shelterAnimals.get(petID);
        } else {
            throw new Exception ("That pet does not exist in the shelter!");
        }
    }

    /*
     * Removes a specific pet
     */
    public adoptPet (Integer petID) throws Exception {
        if (shelterAnimals.containsKey(petID)) {
            shelterAnimals.remove(petID);
        } else {
            throw new Exception("That pet does not exist in the shelter!");
        }
    }


    



}
