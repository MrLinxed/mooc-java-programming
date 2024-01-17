
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);
                
                boolean home = true;
                
                if(visitingTeam.equals(team)) {
                    home = false;
                }
                
                if(homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;
                    
                    if(
                        (home && homePoints > visitingPoints) ||
                        (!home && homePoints < visitingPoints)
                    ) {
                        wins++;
                    } else {
                        losses++;
                    }
                    
                }
                
                
                
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
