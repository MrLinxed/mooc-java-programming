
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(reader.nextLine());

            if(number == 0) {
                break;
            }

            sum = sum + number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
