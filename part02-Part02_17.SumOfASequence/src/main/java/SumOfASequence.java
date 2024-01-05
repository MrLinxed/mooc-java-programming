
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Last number? ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        int sum = 0;

        for(int i = 0; i <= lastNumber; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);
    }
}
