
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
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
                first.add(amount);
            }
            
            if(command.equals("move")) {
                int amount = Integer.parseInt(data);
                
                if(amount > 0){
                    if(amount > first.contains()){
                        second.add(first.contains());
                    } else {
                        second.add(amount);
                    }
                    
                    first.remove(amount);
                }
            }
                
            if(command.equals("remove")) {
                int amount = Integer.parseInt(data);
                second.remove(amount);
            }
        }
    }
}
