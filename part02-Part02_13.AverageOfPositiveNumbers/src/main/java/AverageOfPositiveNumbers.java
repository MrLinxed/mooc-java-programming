
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while(true) {
            double number = Double.parseDouble(reader.nextLine());

            if(number == 0) {
                break;
            }

            if(number < 0) {
                continue;
            }

            sum = sum + number;
            count = count + 1;

        }

        if(count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
    }
}
