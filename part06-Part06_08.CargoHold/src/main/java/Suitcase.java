
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
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(Item item: this.items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() > this.maxWeight){
            return;
        }
        
        this.items.add(item);
    }
    
    public void printItems() {
        for(Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public String toString() {
        if(this.items.isEmpty()){
            return "no items (0 kg)"; 
        }
        
        String itemsText = this.items.size() == 1 ? "item" : "items";
        return this.items.size() + " " + itemsText + " (" + this.totalWeight() + " kg)";
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for(int i = 1; i < this.items.size(); i++) {
            Item item = this.items.get(i);
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
