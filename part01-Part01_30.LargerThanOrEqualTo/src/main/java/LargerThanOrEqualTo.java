
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number1 > number2) {
            System.out.println("Greater number is: " + number1);
        } else if (number1 < number2) {
            System.out.println("Greater number is: " + number2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
