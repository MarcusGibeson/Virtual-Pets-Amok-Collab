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
                PetRobot Robodog = new PetRobot("Robodog", "A robot dog", 75, 75, 75, 75);
                PetRobot Meowotron = new PetRobot("Meowotron", "A robot cat", 75, 75, 75, 75);
                Dog Spot = new Dog("Spot", "A white dog with a brown spot", 75, 75, 75, 75, false);
                Cat DonFluffles = new Cat("Don Fluffles", "Fluffiest cat ever", 75, 75, 75, 75, false);

                PetShelter.addPet(Robodog);
                PetShelter.addPet(Meowotron);
                PetShelter.addPet(Spot);
                PetShelter.addPet(DonFluffles);

                while (!exitGameLoop) {
<<<<<<< HEAD
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
                                                System.out.println("Describe the new pet: ");
                                                String descriptionInput = input.nextLine();
                                                Cat newCat = new Cat(nameInput, descriptionInput, 75, 75, 75, 75, false);
                                                PetShelter.addPet(newCat);
                                                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                                                input.nextLine();
                                                break;
                                        }
                                        case "2" : {
                                                //add dog
                                                System.out.println("What is the name of the new pet?");
                                                String nameInput = input.nextLine();
                                                System.out.println("Describe the new pet: ");
                                                String descriptionInput = input.nextLine();
                                                Dog newDog = new Dog(nameInput, descriptionInput, 75, 75, 75, 75, false);
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
=======
                        PetShelter.showAllPets();

                        String option = menu.mainMenu();
                        PetShelter.tickAll();
                        switch (option) {
                                case "1": {
                                        String liveValue = menu.livePetMenu();
                                        switch (liveValue) {
                                                case "1": {
                                                        // add cat
                                                        addCat();
                                                        // System.out.println("What is the name of the new pet?");
                                                        // String nameInput = input.nextLine();
                                                        // System.out.println("Descripe the new pet: ");
                                                        // String descriptionInput = input.nextLine();
                                                        // Cat newCat = new Cat(nameInput, descriptionInput, 75, 75, 75,
                                                        // 75, false);
                                                        // PetShelter.addPet(newCat);
                                                        // System.out.println(nameInput + " was added to the shelter!
                                                        // Press enter to continue...");
                                                        // input.nextLine();
                                                        break;
                                                }
                                                case "2": {
                                                        // add dog
                                                        addDog();
                                                        // System.out.println("What is the name of the new pet?");
                                                        // String nameInput = input.nextLine();
                                                        // System.out.println("Descripe the new pet: ");
                                                        // String descriptionInput = input.nextLine();
                                                        // Dog newDog = new Dog(nameInput, descriptionInput, 75, 75, 75,
                                                        // 75, false);
                                                        // PetShelter.addPet(newDog);
                                                        // System.out.println(nameInput
                                                        // + " was added to the shelter! Press enter to continue...");
                                                        // input.nextLine();
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
                                                        switch (catOrDog) {
                                                                case "1": {
                                                                        // litter box

                                                                        break;
                                                                }
                                                                case "2": {
                                                                        // dog cages
                                                                        break;
                                                                }
                                                                case "0": {
                                                                        // Return to Live Pet Menu

                                                                        break;
                                                                }
                                                        }
                                                        break;
                                                }
                                                case "0": {
                                                        // Return to Main Menu

                                                        break;
>>>>>>> 0a9ffdee01a93209a0eac16689807c83141d0d9f
                                                }
                                        }
                                        break;
                                }
                                case "2": {
                                        String robotValue = menu.robotPetMenu();
                                        switch (robotValue) {
                                                case "1": {
                                                        // add Robot pet
                                                        System.out.println("What is the name of the model pet?");
                                                        String nameInput = input.nextLine();
                                                        System.out.println("Describe the new pet: ");
                                                        String descriptionInput = input.nextLine();
                                                        PetRobot newRobot = new PetRobot(nameInput, descriptionInput,
                                                                        75, 75, 75, 75);
                                                        PetShelter.addPet(newRobot);
                                                        System.out.println(nameInput
                                                                        + " was added to the shelter! Press enter to continue...");
                                                        input.nextLine();
                                                        break;
                                                }
                                                case "2": {
                                                        // recharge battery
                                                        break;
                                                }
                                                case "3": {
                                                        // oil pets
                                                        break;
                                                }
                                                case "4": {
                                                        // destroy robot
                                                        break;
                                                }
                                                case "5": {
                                                        // shoot laser
                                                        break;
                                                }
                                                case "6":{
                                                        // Recycle Robot Pet
                                                }
                                                case "0": {
                                                        // Return to main menu
                                                        break;
                                                }

                                        }
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

<<<<<<< HEAD
                        }
                }
                }



                
        }            

}
=======
        }

        public void addCat() throws Exception {
                System.out.println("What is the name of the new pet?");
                String nameInput = input.nextLine();
                System.out.println("Descripe the new pet: ");
                String descriptionInput = input.nextLine();
                Cat newCat = new Cat(nameInput, descriptionInput, 75, 75, 75, 75, false);
                PetShelter.addPet(newCat);
                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                input.nextLine();
        }

        public void addDog() throws Exception {
                System.out.println("What is the name of the new pet?");
                String nameInput = input.nextLine();
                System.out.println("Descripe the new pet: ");
                String descriptionInput = input.nextLine();
                Dog newDog = new Dog(nameInput, descriptionInput, 75, 75, 75,75, false);
                PetShelter.addPet(newDog);
                System.out.println(nameInput + " was added to the shelter! Press enter to continue...");
                input.nextLine();
        }
}
>>>>>>> 0a9ffdee01a93209a0eac16689807c83141d0d9f
