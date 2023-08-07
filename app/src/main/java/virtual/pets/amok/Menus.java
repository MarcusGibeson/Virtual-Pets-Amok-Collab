package virtual.pets.amok;

import java.util.Scanner;

public class Menus {
    
    Scanner input = new Scanner(System.in);
    public String mainMenu(){
        
        
        System.out.println("1. Interact with Pets");
        System.out.println("2. Interact with Robots");
        System.out.println("0. Exit");
        System.out.print("\nSelect an Option? ");
        String option = input.nextLine();
        
        return option;
    }
    
    public String livePetMenu(){
        
        
        System.out.println("1. Admit New Cat");
        System.out.println("2. Admint New Dog");
        System.out.println("3. Feed Pets");
        System.out.println("4. Give Pets Water");
        System.out.println("5. Play With Pet");
        System.out.println("6. Adopt out Pet");
        System.out.println("7. Clean litter box or cage");
        System.out.println("0. Exit");
        System.out.print("\nSelect an Option? ");
        
        String value = input.nextLine();
        
        return value;
    }

    public String dogOrCatMenu() {
        System.out.println("1. Clean Cat Litter Boxes");
        System.out.println("2. Clean Dog cages");
        System.out.println("0. Exit");

        String value = input.nextLine();
        return value;
    }
    
    public String robotPetMenu(){
        
        
        System.out.println("1. Create Robot Pet");
        System.out.println("2. Recharge Battery");
        System.out.println("3. Give Pets Oil");
        System.out.println("4. Make Robot dance");
        System.out.println("5. Make Robot shoot laser!");
        System.out.println("6. Recycle Robot Pet");
        System.out.println("7. Return to Main Menu");
        System.out.println("0. Exit");
        System.out.print("\nSelect an Option? ");
        
        String value = input.nextLine();
        
        return value;
    }
    
}