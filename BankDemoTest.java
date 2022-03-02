import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        try (Scanner myobj = new Scanner(System.in)) {
            System.out.print("Enter Deposit Amount: $");
            double dep_amt = myobj.nextDouble();
            acc.deposit(dep_amt);
            System.out.print("Enter Withdrawal Amount: $");
            double wd_amt = myobj.nextDouble();
            acc.withdraw(wd_amt);
            System.out.println("The balance after withdrawal is: $" + acc.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $" + (e.getAmount() - acc.getBalance()));
        }
    }
}
