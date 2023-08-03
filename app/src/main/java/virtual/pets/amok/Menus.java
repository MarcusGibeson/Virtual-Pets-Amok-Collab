package virtual.pets.amok;

import java.util.Scanner;

public class Menus {
    /*
     * Menu can be adjusted based on variables added. Tim Asberry
     */
    Scanner input = new Scanner(System.in);
    public String displayMenu(){
        
        
        System.out.println("1. Find Live Pet");
        System.out.println("2. Feed Pets");
        System.out.println("3. Give Pets Water");
        System.out.println("4. Play with Pet");
        System.out.println("5. Clean Cage");
        System.out.println("6. Adopt out Live Pet");
        System.out.println("7. Robot Pet Menu ===>");
        System.out.println("0. Exit");

        System.out.print("\nSelect an Option: ");
        String option = input.nextLine();
        
        return option;
    }
    /*
     * 
     */
    public String displayMenu2(){
        
        
        System.out.println("1. Robot Pet Oil Refill");
        System.out.println("2. Recharge battery");
        System.out.println("3. Give Pets Water");
        System.out.println("4. Wash Pets");
        System.out.println("5. Live Pet Menu ===>");
        System.out.println("0. Exit");
        System.out.print("\nSelect an Option? ");
        
        String option = input.nextLine();
        
        return option;
    }
    
}
