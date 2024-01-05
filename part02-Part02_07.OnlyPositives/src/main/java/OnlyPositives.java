
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(reader.nextLine());

            if(number == 0) {
                break;
            }

            if(number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            int powerOfTwo = number * number;
            System.out.println(powerOfTwo);
        }
    }
}
