public class CheckingAccount {
    private double balance;
    private String account_number;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else if (amount < balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNumber() {
        return this.account_number;
    }
}
