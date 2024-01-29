
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    
    private static final double affordableMealCosts = 2.5;
    private static final double heartyMealCost = 4.3;


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment < PaymentTerminal.affordableMealCosts) {
            return payment;
        }
        
        this.money += PaymentTerminal.affordableMealCosts;
        this.affordableMeals += 1;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment - PaymentTerminal.affordableMealCosts;
    }

    public double eatHeartily(double payment) {
        if(payment < PaymentTerminal.heartyMealCost) {
            return payment;
        }
        
        this.money += PaymentTerminal.heartyMealCost;
        this.heartyMeals += 1;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment - PaymentTerminal.heartyMealCost;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        double balance = card.balance();
        if(balance < PaymentTerminal.affordableMealCosts) {
            return false;
        }
        
//        this.money += PaymentTerminal.affordableMealCosts;
        this.affordableMeals += 1;
        
        card.takeMoney(PaymentTerminal.affordableMealCosts);
        
        return true;
        
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        double balance = card.balance();
        if(balance < PaymentTerminal.heartyMealCost) {
            return false;
        }
        
//        this.money += PaymentTerminal.heartyMealCost;
        this.heartyMeals += 1;
        
        card.takeMoney(PaymentTerminal.heartyMealCost);
        
        return true;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum < 0){
            return;
        }
        
        this.money += sum;
        card.addMoney(sum);
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
