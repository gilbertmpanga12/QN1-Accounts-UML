public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }

        if (balance - amount < 0) {
            return false;
        }

        balance = balance - amount;
        return true;
    }

    public void addInterest() {
        double interest = balance * rate / 100;
        balance = balance + interest;
    }
}
