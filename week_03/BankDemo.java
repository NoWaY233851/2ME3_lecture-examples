package week_03;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.balance = 500.00;

        // Potential Error
        myAccount.balance = -1000.00; 

        // Bypass the constraint
        myAccount.balance = 999999.00; 
    }
}