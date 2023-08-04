package virtual.pets.amok;

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
        public void driver() {

                boolean exitGameLoop = false;
                Menus menu = new Menus();

                /*
                 * Creates starting pets in shelter (1 of each)
                 */
                PetRobot Robodog = new PetRobot(robotDog);
                PetRobot Meowotron = new PetRobot(robotCat);
                Dog Spot = new Dog(dog);
                Cat DonFluffles = new Cat(cat);

                PetShelter.addPet(Robodog);
                PetShelter.addPet(Meowotron);
                PetShelter.addPet(Spot);
                PetShelter.addPet(Tiger);

                while (!exitGameLoop) {
                PetShelter.showAllpets();
                
                String option = menu.mainMenu();
                switch (option) {
                        case "1" : {
                                String liveValue = menu.livePetMenu();
                                Switch (liveValue) {
                                        case "1" : {
                                                //add pet
                                                break;
                                        }
                                        case "2" : {
                                                //feed
                                                break;
                                        }
                                        case "3" : {
                                                //water
                                                break;
                                        }                                        
                                        case "4" : {
                                                //play
                                                break;
                                        }
                                }
                                break;
                        }
                        case "2" : {
                                String robotValue = menu.robotPetMenu();
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
