
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
public class Hold {
    private ArrayList<Suitcase> cases = new ArrayList<>();
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Suitcase item: this.cases){
            totalWeight += item.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() > this.maxWeight){
            return;
        }
        
        this.cases.add(suitcase);
    }
    
    public void printItems() {
        for(Suitcase item: this.cases) {
            item.printItems();
        }
    }
    
    public String toString() {
        if(this.cases.isEmpty()){
            return "no suitcases (0 kg)"; 
        }
        
        String itemsText = this.cases.size() == 1 ? "suitcase" : "suitcases";
        return this.cases.size() + " " + itemsText + " (" + this.totalWeight() + " kg)";
    }
}
