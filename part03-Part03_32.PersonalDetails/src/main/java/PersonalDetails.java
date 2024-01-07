
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int count = 0;
        double birthYearSum = 0;
        while(true) {
            String text = scanner.nextLine();
            if(text.isEmpty()) {
                break;
            }
            
            String[] parts = text.split(",");
            String name = parts[0];
            int birthYear = Integer.parseInt(parts[1]);
            
            if(name.length() > longestName.length()) {
                longestName = name;
            }
            
            count = count + 1;
            birthYearSum = birthYearSum + birthYear;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (birthYearSum / count));
    }
}
