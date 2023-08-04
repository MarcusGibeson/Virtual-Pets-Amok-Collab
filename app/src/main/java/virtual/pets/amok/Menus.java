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
        
        
        System.out.println("1. Admit Pet");
        System.out.println("2. Feed Pets");
        System.out.println("3. Give Pets Water");
        System.out.println("4. Play With Pet");
        System.out.println("5. Adopt out Pet");
        System.out.println("6. Return to Main Menu");
        System.out.println("0. Exit");
        System.out.print("\nSelect an Option? ");
        
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