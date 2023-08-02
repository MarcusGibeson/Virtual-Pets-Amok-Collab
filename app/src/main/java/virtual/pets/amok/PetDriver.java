package virtual.pets.amok;

import java.util.Scanner;


//driver class to put all application work inside
public class PetDriver {
        /*
         * creates the HashMap
         */
        PetShelter PetShelter = new PetShelter();
        Scanner input = new Scanner(System.in);

        /*
         * Starts the game loop
         */
        public void driver() throws Exception {

                boolean exitGameLoop = false;
                Menus menu = new Menus();

                /*
                 * Creates starting pets in shelter (1 of each)
                 */
                // PetRobot Robodog = new PetRobot(robotDog);
                // PetRobot Meowotron = new PetRobot(robotCat);
                Dog Spot = new Dog("Spot", "brown dog", 75, 75, 75, 75);
                Cat DonFluffles = new Cat("Don Fluffles", "black cat", 75, 75, 75, 75);

                // PetShelter.addPet(Robodog);
                // PetShelter.addPet(Meowotron);
                PetShelter.addPet(Spot);
                PetShelter.addPet(DonFluffles);

                PetShelter.showAllPets();

        }
}
