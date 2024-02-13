/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class Container {
    private int amount;
    private int maxSize;

    public Container(int maxSize) {
        this.amount = 0;
        this.maxSize = maxSize;
    }
    
    public Container() {
        this(100);
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if(amount < 0){
            return;
        }
        
        this.amount += amount;
        if(this.amount > this.maxSize){
            this.amount = this.maxSize;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0){
            return;
        }
        
        this.amount -= amount;
        if(this.amount < 0){
            this.amount = 0;
        }
    }
    
    public String toString() {
        return this.amount + "/" + this.maxSize;
    }
    
}
