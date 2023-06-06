package cwiczenia.singleton.cwiczenia;

public class Client {
    public static void main(String[] args) {
        BankAccount acc = BankAccount.getInstance();
        BankAccount acc2 = BankAccount.getInstance();

        acc.deposit(600);
        acc2.deposit(600);

        acc2.withdraw(1700);
        acc2.getInfo();
        acc2.withdraw(200);
    }
}
