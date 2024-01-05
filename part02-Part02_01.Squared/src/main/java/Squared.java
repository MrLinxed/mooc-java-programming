
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int input = Integer.parseInt(reader.nextLine());
        int squared = input * input;
        System.out.println(squared);
    }
}
