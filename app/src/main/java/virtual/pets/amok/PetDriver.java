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
        public void driver() throws Exception  {

                boolean exitGameLoop = false;
                Menus menu = new Menus();

                /*
                 * Creates starting pets in shelter (1 of each)
                 */
                Pet Robodog = new Pet("Robodog", "A robot dog", 75, 75, true, true);
                Pet Meowotron = new Pet("Meowotron", "A robot cat", 75, 75, true, true);
                Pet Spot = new Pet("Spot", "A white dog with a brown spot", 75, 75, 75, 75, false);
                Pet DonFluffles = new Pet("Don Fluffles", "Fluffiest cat ever", 75, 75, 75, 75, 0);

                PetShelter.addPet(Robodog);
                PetShelter.addPet(Meowotron);
                PetShelter.addPet(Spot);
                PetShelter.addPet(DonFluffles);

                while (!exitGameLoop) {
                PetShelter.showAllPets();
                
                String option = menu.mainMenu();
                switch (option) {
                        case "1" : {
                                String liveValue = menu.livePetMenu();
                                switch (liveValue) {
                                        case "1" : {
                                                //add cat
                                                System.out.println("What is the name of the new pet?");
                                                String nameInput = input.nextLine();
                                                System.out.println("Descripe the new pet: ");
                                                String descriptionInput = input.nextLine();
                                                Pet newCat = new Pet(nameInput, descriptionInput, 75, 75, 75, 75, 0);
                                                PetShelter.addPet(newCat);
                                                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                                                input.nextLine();
                                                break;
                                        }
                                        case "2" : {
                                                //add dog
                                                System.out.println("What is the name of the new pet?");
                                                String nameInput = input.nextLine();
                                                System.out.println("Descripe the new pet: ");
                                                String descriptionInput = input.nextLine();
                                                Pet newDog = new Pet(nameInput, descriptionInput, 75, 75, 75, 75, false);
                                                PetShelter.addPet(newDog);
                                                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                                                input.nextLine();
                                                break;
                                        }
                                        case "3" : {
                                                //feed
                                                break;
                                        }
                                        case "4" : {
                                                //water
                                                break;
                                        }                                        
                                        case "5" : {
                                                //play
                                                break;
                                        }
                                        case "6" : {
                                                //adopt pet
                                                break;
                                        }
                                        case "7" : {
                                                //clean litter or cage
                                                String catOrDog = menu.dogOrCatMenu();
                                                switch (catOrDog) {
                                                        case "1" : {
                                                                //litter box
                                                                break;
                                                        }
                                                        case "2" : {
                                                                //dog cages
                                                                break;
                                                        }
                                                        case "0" : {
                                                                //exit
                                                                break;
                                                        }
                                                }
                                                break;
                                        }
                                        case "0" : {
                                                //exit 
                                                break;
                                        }
                                }
                                break;
                        }
                        case "2" : {
                                String robotValue = menu.robotPetMenu();
                                switch (robotValue) {
                                        case "1" : {
                                                //create pet
                                                break;
                                        }
                                        case "2" : {
                                                //recharge battery
                                                break;
                                        }
                                        case "3" : {
                                                //oil pets
                                                break;
                                        }
                                        case "4" : {
                                                //robot dance
                                                break;
                                        }
                                        case "5" : {
                                                //robot laser
                                                break;
                                        }
                                        case "6" : {
                                                //recycle robot
                                                break;
                                        }
                                        case "7" : {
                                                //previous menu
                                                break;
                                        }
                                        case "0" : {
                                                //exit
                                                break;
                                        }

                                }
                                break;
                        }
                        case "0" : {
                                System.out.println("Now exiting game.");
                                System.exit(0);
                                exitGameLoop = true;
                                break;

                        }
                }
                }
        }
}
