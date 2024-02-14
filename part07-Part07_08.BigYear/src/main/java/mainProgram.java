
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        BirdManager manager = new BirdManager();
        
        while(true) {
            System.out.println("? ");
            String command = scan.nextLine();
            
            if(command.equalsIgnoreCase("quit")) {
                break;
            }
            
            else if(command.equalsIgnoreCase("one")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                System.out.println(manager.getBird(name));
            }
            
            else if(command.equalsIgnoreCase("all")){
                System.out.println(manager);
            }
            
            else if(command.equalsIgnoreCase("observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                Bird bird = manager.getBird(name);
                if (bird != null) {                    
                    manager.observe(bird);
                } else {
                    System.out.println("Not a bird!");
                }
            }
            
            else if(command.equalsIgnoreCase("add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                manager.addBird(name, latinName);
            }
        }
    }
}
