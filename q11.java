class BankAccount{
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount{
     public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal denied! Balance cannot fall below $100.");
        }
    }
}
public class q11 {
    public static void main(String[] args){
        SavingsAccount myAccount = new SavingsAccount(500);

        myAccount.displayBalance();
        myAccount.deposit(200);
        myAccount.displayBalance();

        myAccount.withdraw(550); 
        myAccount.displayBalance();

        myAccount.withdraw(400); 
        myAccount.displayBalance();
    }
}
