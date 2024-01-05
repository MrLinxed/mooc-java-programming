
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int count = 0;

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(reader.nextLine());

            if(number == 0) {
                break;
            }

            count = count + 1;
        }


        System.out.println("Number of numbers: " + count);
    }
}
