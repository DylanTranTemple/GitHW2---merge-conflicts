public class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if(amount <= balance+50){
            balance -= amount;
            return true;
        }
        return false;
    }
    public String getAccountSummary() {
        return accountHolder + ": $" + balance;
    }
}