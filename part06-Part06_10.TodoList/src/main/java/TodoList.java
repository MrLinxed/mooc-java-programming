
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        for(int i = 0; i < this.list.size(); i++) {
            String item = this.list.get(i);
            System.out.println((i + 1) + ": " + item);
        }
    }
    
    public void remove(int itemNumber) {
        this.list.remove(itemNumber - 1);
    }
}
