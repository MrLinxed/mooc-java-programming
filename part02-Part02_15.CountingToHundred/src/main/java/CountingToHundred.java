
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int countInput = Integer.parseInt(reader.nextLine());
        for(int i = countInput; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
