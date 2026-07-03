public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Amina Nansubuga");

        SavingsAccount savings = new SavingsAccount("UG-SAV-1001", 500000, 5);
        CurrentAccount current = new CurrentAccount("UG-CUR-2001", 250000, 150000);

        customer.addAccount(savings);
        customer.addAccount(current);

        savings.deposit(100000);
        boolean savingsResult = savings.withdraw(700000);
        savings.addInterest();

        boolean currentResult = current.withdraw(350000);

        System.out.println("COMMUNITY BANK ACCOUNT REPORT");
        System.out.println("Customer: " + customer.getName());
        System.out.println(savings.generateStatement());
        System.out.println("Savings withdrawal of UGX 700000 successful? " + savingsResult);
        System.out.println(current.generateStatement());
        System.out.println("Current withdrawal of UGX 350000 successful? " + currentResult);
        System.out.println("Total worth: UGX " + customer.totalWorth());
    }
}
