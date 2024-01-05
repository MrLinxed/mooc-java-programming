
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());

        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int secondsInDay = secondsInMinute * minutesInHour * hoursInDay;

        System.out.println(days * secondsInDay);

    }
}
