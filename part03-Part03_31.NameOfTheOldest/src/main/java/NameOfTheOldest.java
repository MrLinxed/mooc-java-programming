
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String name = "";
        while(true) {
            String text = scanner.nextLine();
            if(text.isEmpty()) {
                break;
            }
            
            String[] parts = text.split(",");
            int age = Integer.parseInt(parts[1]);
            
            if(age > oldest) {
                oldest = age;
                name = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);

    }
}
