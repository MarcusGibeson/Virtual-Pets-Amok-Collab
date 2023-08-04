package virtual.pets.amok;
<<<<<<< HEAD
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
=======

>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
//driver class to put all application work inside
public class PetDriver {
        /*
         * creates the HashMap
         */
        PetShelter PetShelter = new PetShelter();
        Scanner input = new Scanner(System.in);

<<<<<<< HEAD
<<<<<<< Updated upstream
    /*
     * Starts the game loop
     */
    public void driver() {
        
            boolean exitGameLoop = false;
            Menus menu = new Menus();
=======
=======
>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
        /*
         * Starts the game loop
         */
        public void driver() {
<<<<<<< HEAD
>>>>>>> Stashed changes
=======
>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee

                boolean exitGameLoop = false;
                Menus menu = new Menus();

<<<<<<< HEAD
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

=======
                /*
                 * Creates starting pets in shelter (1 of each)
                 */
                PetRobot Robodog = new PetRobot(robotDog);
                PetRobot Meowotron = new PetRobot(robotCat);
                Dog Spot = new Dog(dog);
                Cat DonFluffles = new Cat(cat);

>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
                PetShelter.addPet(Robodog);
                PetShelter.addPet(Meowotron);
                PetShelter.addPet(Spot);
                PetShelter.addPet(Tiger);

                PetShelter.showAllpets();
                
        }
<<<<<<< HEAD
>>>>>>> Stashed changes
=======
>>>>>>> f2020ed1e438aa7dc1be9052129d89cd8dab2aee
}
