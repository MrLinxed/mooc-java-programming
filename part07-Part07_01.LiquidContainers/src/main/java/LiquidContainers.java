
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            String command = parts[0];
            String data = parts.length > 1 ? parts[1] : "";
            
            if (command.equals("quit")) {
                break;
            }
            
            
            if(command.equals("add")) {
                int amount = Integer.parseInt(data);
                
                if(amount > 0){
                    first += amount;
                    if(first > 100) {
                        first = 100;
                    }
                }
            }
            
            if(command.equals("move")) {
                int amount = Integer.parseInt(data);
                
                if(amount > 0){
                    if(amount > first){
                        second += first;
                        first = 0;
                    } else {
                        first -= amount;
                        second += amount;
                    }
                    
                    if(first < 0){
                        first = 0;
                    }
                    
                    if(second > 100) {
                        second = 100;
                    }
                }
            }
                
            if(command.equals("remove")) {
                int amount = Integer.parseInt(data);
                
                if(amount > 0) {
                    second -= amount;
                    if(second < 0){
                        second = 0;
                    }
                }
            }
            

        }
    }

}
