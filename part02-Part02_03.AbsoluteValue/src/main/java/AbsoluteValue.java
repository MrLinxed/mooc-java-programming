
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int input = Integer.parseInt(reader.nextLine());

        if(input < 0) {
            System.out.println(input * -1);
        } else {
            System.out.println(input);
        }
    }
}
