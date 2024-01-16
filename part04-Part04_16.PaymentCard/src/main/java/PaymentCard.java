/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        double price = 2.60;
        if(this.balance - price >= 0.0) {  
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if(this.balance - price >= 0.0) {  
            this.balance -= price;
        }
    }
    
    public void addMoney(double amount) {
        if(amount < 0.0){
            return;
        }
        
        this.balance += amount;
        
        if(this.balance > 150.0){
            this.balance = 150.0;
        }
    }
}
