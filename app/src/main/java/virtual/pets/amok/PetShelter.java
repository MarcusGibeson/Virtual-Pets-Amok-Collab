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
    



}
