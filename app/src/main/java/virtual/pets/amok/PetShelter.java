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
        for (Integer pet : shelterAnimals.keySet()) {
            System.out.println(shelterAnimals.get(pet));
            
        }
    }
    
    /*
    *  Find pet method to get name from pet values
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
    public void feedAllPets(){
        for(Pet pet: shelterAnimals.values()){
            if (pet instanceof PetLive) {
                ((PetLive) pet).feedPet();
                System.out.println(pet.getName() + " has been fed.");
            }
        }
    }
    /*
     * hydrates all pets
     */
    public void waterAllPets(){
        for(Pet pet: shelterAnimals.values()){
            if(pet instanceof PetLive){
                ((PetLive) pet).hydratePet();
                System.out.println(pet.getName() + " has been hydrated.");
            }
        }
    }
    /*
     * Plays with one specific pet
     */
    public void playWithPet() throws Exception{
        System.out.println("Select a Pet: ");
        for(Pet pet:shelterAnimals.values()){
            findPet(input.nextLine());
            if(pet instanceof PetLive){
                ((PetLive)pet).playPet();
        System.out.println(pet.getName()+ " had fun!");}}
    }
    
    public void cleanSingleLitter() {
        for (Pet pet : shelterAnimals.values()) {
            if(pet instanceof Cat) {
                
            }
        }
        
        
    }
    

    public void tickAll() {
        for (Pet pet : shelterAnimals.values()) {
            if(pet instanceof PetLive){
                ((PetLive) pet).tick();
                ((PetLive) pet).deathTick();
            }
        // else if (pet instanceof PetRobot) {
        //         ((PetRobot) pet).robotTick();
        // }
        }
        Pet pet = findPet("DEAD");
        shelterAnimals.remove(pet.getPetID());
            
    }
            
            
        
    
    
    /*
     * oil all robot pets
     */
    public void oilAllPets(){
        for(Pet pet: shelterAnimals.values()){
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).oilRobot();
                System.out.println(pet.getName() + " has been oiled.");
            }
        }
    }

    /*
     * repair all robot pets
     */
    public void repairAllPets(){
        for(Pet pet: shelterAnimals.values()){
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).repairRobot();
                System.out.println(pet.getName() + " is all set.");
            }
        }
    }
        /*
     * clean all robot pets
     */
    public void cleanAllPets(){
        for(Pet pet: shelterAnimals.values()){
            if (pet instanceof PetRobot) {
                ((PetRobot) pet).repairRobot();
                System.out.println(pet.getName() + " is all set.");
            }
        }
    }
}

<<<<<<< HEAD


}
=======
>>>>>>> 9885e4eb2d7e27c60947fc1a92db2f219a7ea572
