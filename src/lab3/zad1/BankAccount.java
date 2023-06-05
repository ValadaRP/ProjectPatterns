package lab3.zad1;

public class BankAccount {

    private static BankAccount account;
    private double balance;
    private double debit;

    private BankAccount() {
        this.balance = 0;
        this.debit = 500;
    }

    public static BankAccount getInstance(){
        if (account == null){
            account = new BankAccount();
        }
        return account;
    }

    public void getInfo(){
        System.out.println("Your balance is: " + balance);
    }

    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Pelase pass good value: ");
        }else {
            balance += amount;
        }
        System.out.println("Your balance is: " + balance);
    }

    public void withdraw(double amount){
        double maxWithdraw = balance + debit;
        if (maxWithdraw >= amount){
            balance -= amount;
            System.out.println("You withdrowed: " + amount);
        }else {
            System.out.println("You pass your debit on your card! Max to withdrow is: " + maxWithdraw);
        }
    }
}
