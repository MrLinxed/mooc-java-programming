import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while(true) {
            String text = scanner.nextLine();
            if(text.isEmpty()) {
                break;
            }
            
            String[] parts = text.split(",");
            int age = Integer.parseInt(parts[1]);
            
            if(age > oldest) {
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
