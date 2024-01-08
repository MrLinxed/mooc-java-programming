
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthrewsAcc = new Account("Matthews account", 1000.0);
        Account myAcc = new Account("My account", 0.0);
        
        matthrewsAcc.withdrawal(100.0);
        myAcc.deposit(100.0);
        
        System.out.println(matthrewsAcc);
        System.out.println(myAcc);
    }
}
