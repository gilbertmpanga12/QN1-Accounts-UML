public abstract class Account implements Statement {
    protected String accountNo;
    protected double balance;

    public Account(String accountNo, double opening) {
        this.accountNo = accountNo;
        this.balance = opening;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String generateStatement() {
        return "Account Number: " + accountNo + ", Current Balance: UGX " + balance;
    }
}
