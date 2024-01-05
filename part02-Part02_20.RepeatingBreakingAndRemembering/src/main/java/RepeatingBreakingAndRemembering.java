
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while(true) {
            int number = Integer.parseInt(reader.nextLine());

            if(number == -1) {
                break;
            }

            sum = sum + number;
            count = count + 1;

            if(number % 2 == 0){
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
