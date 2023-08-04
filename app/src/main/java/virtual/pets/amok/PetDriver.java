package virtual.pets.amok;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
//driver class to put all application work inside
public class PetDriver {
  /*
     * creates the HashMap
     */
    PetShelter PetShelter = new PetShelter();
    Scanner input = new Scanner(System.in);

<<<<<<< Updated upstream
    /*
     * Starts the game loop
     */
    public void driver() {
        
            boolean exitGameLoop = false;
            Menus menu = new Menus();
=======
        /*
         * Starts the game loop
         */
        public void driver() {
>>>>>>> Stashed changes

            /*
             * Creates starting pets in shelter (1 of each)
             */
            PetRobot Robodog = new PetRobot(robotDog);
            PetRobot Meowotron = new PetRobot(robotCat);
            Dog Spot = new Dog(dog);
            Cat DonFluffles = new Cat(cat);

<<<<<<< Updated upstream
            PetShelter.addPet(Robodog);
            PetShelter.addPet(Meowotron);
            PetShelter.addPet(Spot);
            PetShelter.addPet(Tiger);
            
            PetShelter.showAllpets();

    }
=======
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

                PetShelter.showAllpets();
                
        }
>>>>>>> Stashed changes
}
