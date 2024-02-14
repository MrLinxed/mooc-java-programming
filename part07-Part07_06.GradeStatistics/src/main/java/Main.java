import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scores scores = new Scores();
        
        System.out.println("Enter points totals, -1 stops:");
        while(true) {
            int numberInput = Integer.parseInt(scanner.nextLine());
           
            if(numberInput == -1) {
                break;
            }
            
            scores.add(numberInput);
            
        }
        
        int participants = scores.scores().size();
        int passing = scores.scoresAbove(50).size();
        double passPercentage = passing / (double)participants * 100.0;
        
        double average = scores.average();
        double passingAverage = scores.average(50);
        
        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + (passingAverage > 0 ? passingAverage : "-"));
        System.out.println("Pass percentage: " + passPercentage);
        
        System.out.println("Grade distribution: ");
        int[] bracketCounts = scores.bracketCounts();
        for(int i = 0; i < bracketCounts.length; i++) {
            System.out.print((bracketCounts.length - i - 1) + ": ");
            Main.printStars(bracketCounts[i]);
            System.out.println();
        }
    }
    
    public static void printStars(int count) {
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
    }
}
