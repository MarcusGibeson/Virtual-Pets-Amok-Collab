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
                PetRobot Robodog = new PetRobot("Robodog", "A robot dog", 75, 75, 25, 100);
                PetRobot Meowotron = new PetRobot("Meowotron", "A robot cat", 75, 75, 25, 100);
                Dog Spot = new Dog("Spot", "A white dog with a brown spot", 20, 20, 20, 20, false);
                Cat DonFluffles = new Cat("Don Fluffles", "Fluffiest cat ever", 20, 20, 20, 20, false);

                PetShelter.addPet(Robodog);
                PetShelter.addPet(Meowotron);
                PetShelter.addPet(Spot);
                PetShelter.addPet(DonFluffles);

                

                
                while(!exitGameLoop){
                String option = menu.mainMenu();
                PetShelter.showAllPets();
                PetShelter.tickAll();
                

                switch (option) {

                        
                        case "1": {
                                String liveValue = menu.livePetMenu();
                                if(liveValue.equals("0")){
                                        break;
                                }
                                switch (liveValue) {
                                        
                                        case "1": {
                                                // add cat
                                                addCat();
                                                break;
                                        }
                                        case "2": {
                                                // add dog
                                                addDog();
                                                break;
                                        }
                                        case "3": {
                                                // feed
                                                PetShelter.feedAllPets();
                                                break;
                                        }
                                        case "4": {
                                                // water
                                                PetShelter.waterAllPets();
                                                break;
                                        }
                                        case "5": {
                                                // play
                                                PetShelter.playWithPet();
                                                break;
                                        }
                                        case "6": {
                                                // adopt pet
                                                System.out.print("Select a Pet:  ");
                                                String petAdopted = input.nextLine();
                                                PetShelter.adoptPet(petAdopted);
                                                break;
                                        }
                                        case "7": {
                                                // clean litter or cage
                                                String catOrDog = menu.dogOrCatMenu();
                                                PetShelter.tickAll();
                                                switch (catOrDog) {
                                                        case "1": {
                                                                // litter box
                                                                PetShelter.cleanSingleLitter();
                                                                break;
                                                        }
                                                        case "2": {
                                                                // dog cages
                                                                PetShelter.cleanSingleCage();
                                                                break;
                                                        }
                                                        case "0": {
                                                                // Return to Main Menu
                                                                break;
                                                        }
                                                }
                                                break;
                                        }
                                        case "0": {
                                                // Return to Main Menu
                                                break;
                                        }
                                }
                                break;
                        }
                        
                        case "2": {
                                String robotValue = menu.robotPetMenu();
                                
                                switch (robotValue) {
                                        case "1": {
                                                // add Robot pet
                                                addRobot();
                                                break;
                                        }
                                        case "2": {
                                                PetShelter.oilAllPets();
                                                break;
                                        }
                                        case "3": {
                                                PetShelter.chargeAllPets();
                                                break;
                                        }
                                        case "4": {
                                                PetShelter.allDance();
                                                break;
                                        }
                                        case "5": {
                                                PetShelter.allLaser();
                                                break;
                                        }
                                        case "6": {
                                                PetShelter.repairAllPets();
                                                ;
                                                break;
                                        }
                                        case "7": {
                                                PetShelter.cleanAllPets();
                                                break;
                                        }
                                        case "8": {
                                                // Adopt robot
                                                System.out.print("Select a Pet:  ");
                                                String petAdopted = input.nextLine();
                                                PetShelter.adoptPet(petAdopted);
                                                break;
                                        }
                                        case "0": {
                                                // Return to main menu
                                                break;
                                        }

                                }
                                break;
                        }
                        case "3": {
                                // list all pets
                                System.out.println("Here are your pets:");
                                PetShelter.showDescriptions();
                                System.out.println("");
                                System.out.println("");
                                System.out.println("Press enter to continue.\n\n");
                                input.nextLine();
                                break;
                        }
                        case "0": {
                                System.out.println("Now exiting game.");
                                System.exit(0);
                                exitGameLoop = true;
                                break;

                        }
                }
        }
        }

        public void addCat() throws Exception {
                System.out.println("What is the name of the new pet?");
                String nameInput = input.nextLine();
                System.out.println("Describe the new pet: ");
                String descriptionInput = input.nextLine();
                Cat newCat = new Cat(nameInput, descriptionInput, 20, 20, 20, 20, false);
                PetShelter.addPet(newCat);
                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                input.nextLine();
        }

        public void addDog() throws Exception {
                System.out.println("What is the name of the new pet?");
                String nameInput = input.nextLine();
                System.out.println("Describe the new pet: ");
                String descriptionInput = input.nextLine();
                Dog newDog = new Dog(nameInput, descriptionInput, 20, 20, 20, 20, false);
                PetShelter.addPet(newDog);
                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                input.nextLine();
        }

        public void addRobot() throws Exception {
                System.out.println("What is the name of the new pet?");
                String nameInput = input.nextLine();
                System.out.println("Describe the new pet: ");
                String descriptionInput = input.nextLine();
                PetRobot newRobot = new PetRobot(nameInput, descriptionInput,75, 75, 25, 100);
                PetShelter.addPet(newRobot);
                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                input.nextLine();
        }
        
}
