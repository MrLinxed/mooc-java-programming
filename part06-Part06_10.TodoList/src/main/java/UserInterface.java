
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
public class UserInterface {
    
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                this.handleAdd();
            } else if(command.equals("list")) {
                this.handleList();
            } else if(command.equals("remove")) {
                this.handleRemove();
            }
        }
    }
    
    public void handleAdd() {
        System.out.println("To add:");
        String todoItem = this.scanner.nextLine();
        
        this.list.add(todoItem);
    }
    
    public void handleList() {
        this.list.print();
    }
    
    public void handleRemove() {
        System.out.println("Which one is removed?:");
        int index = Integer.parseInt(this.scanner.nextLine());
        
        this.list.remove(index);
    }
}
