
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int inputOne = Integer.parseInt(reader.nextLine());
        int inputTwo = Integer.parseInt(reader.nextLine());

        if(inputOne > inputTwo) {
            System.out.println(inputOne + " is greater than " + inputTwo + ".");
        } else if (inputTwo > inputOne) {
            System.out.println(inputOne + " is smaller than " + inputTwo + ".");
        } else {
            System.out.println(inputOne + " is equal to " + inputTwo + ".");
        }
    }
}
