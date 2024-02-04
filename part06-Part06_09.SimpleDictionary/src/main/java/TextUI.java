
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")) {
                this.handleAdd();
            } else if(command.equals("search")) {
                this.handleSearch();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public void handleAdd() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        
        System.out.println("Translation:");
        String translation = this.scanner.nextLine();
        
        this.dictionary.add(word, translation);
    }
    
    public void handleSearch() {
        System.out.println("To be translated:");
        String word = this.scanner.nextLine();
        
        String translation = this.dictionary.translate(word);
        if(translation == null || translation.isBlank()) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
    
}
