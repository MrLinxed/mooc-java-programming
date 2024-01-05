
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.parseInt(scanner.nextLine());
        int cap = 5000;

        if (gift < cap) {
            System.out.println("No Tax");
            return;
        }

        double taxAmount;

        if (gift < 25000) {
            taxAmount = 100 + (gift - 5000) * (8.0 / 100);
        } else if (gift < 55000) {
            taxAmount = 1700 + (gift - 25000) * (10.0 / 100);
        } else if (gift < 200000) {
            taxAmount = 4700 + (gift - 55000) * (12.0 / 100);
        } else if (gift < 1000000) {
            taxAmount = 22100 + (gift - 200000) * (15.0 / 100);
        } else {
            taxAmount = 142100 + (gift - 1000000) * (17.0 / 100);
        }

        System.out.println("Tax: " + taxAmount);
    }
}
