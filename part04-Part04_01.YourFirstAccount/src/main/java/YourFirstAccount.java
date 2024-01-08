
public class YourFirstAccount {

    public static void main(String[] args) {
        Account mrLinxedAccount = new Account("Mr Linxed's account", 100.0);
        mrLinxedAccount.deposit(20.0);
        System.out.println(mrLinxedAccount);
    }
}
