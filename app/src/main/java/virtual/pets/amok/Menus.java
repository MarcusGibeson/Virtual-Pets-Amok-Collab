package virtual.pets.amok;

import java.util.Scanner;

public class Menus {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    Scanner input = new Scanner(System.in);

    public String mainMenu(){
        
        
        System.out.println(ANSI_GREEN + "1. Interact with Pets" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "2. Interact with Robots" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "3. List all pets" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "0. Exit" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "\nSelect an Option? " + ANSI_RESET);
        String option = input.nextLine();
        
        return option;
    }
    
    public String livePetMenu(){
        
        
        System.out.println(ANSI_CYAN + "1. Admit New Cat" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "2. Admit New Dog" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "3. Feed Pets" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "4. Give Pets Water" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "5. Play With Pet" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "6. Adopt out Pet" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "7. Clean litter box or cage" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "0. Return to Main Menu?" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "\nSelect an Option? " + ANSI_RESET);
        
        String value = input.nextLine();
        
        return value;
    }

    public String dogOrCatMenu() {
        System.out.println(ANSI_PURPLE + "1. Clean Cat Litter Boxes" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "2. Clean Dog cages" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "0. Return to Live Pet Menu?" + ANSI_RESET);

        String value = input.nextLine();
        return value;
    }
    
    public String robotPetMenu(){
        
        
        System.out.println(ANSI_RED + "1. Create Robot Pet" + ANSI_RESET);
        System.out.println(ANSI_RED + "2. Recharge Battery" + ANSI_RESET);
        System.out.println(ANSI_RED + "3. Give Pets Oil" + ANSI_RESET);
        System.out.println(ANSI_RED + "4. Make Robot dance" + ANSI_RESET);
        System.out.println(ANSI_RED + "5. Make Robot shoot laser!" + ANSI_RESET);
        System.out.println(ANSI_RED + "6. Repair Robot pets" + ANSI_RESET);
        System.out.println(ANSI_RED + "7. Clean Robot pets" + ANSI_RESET);
        System.out.println(ANSI_RED + "8. Sell Robot Pet" + ANSI_RESET);
        System.out.println(ANSI_RED + "0. Return to Main Menu?" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "\nSelect an Option? " + ANSI_RESET);
        
        String value = input.nextLine();
        
        return value;
    }
    
}