import java.util.Scanner;

public class BankTest {

    private int accountNumber;
    private String accountHolder;
    private double balance;

//    constructor
    public BankTest(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

//    Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance()  {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    Deposit method

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of KSH" + amount + " successful. Current balance: KSH" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

//    Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of KSH" + amount + " successful. Current balance: KSH" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance. Please try again");
        }
    }

//    Display account information
    public void displayAccountInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: KSH" + balance);
    }

    public static void main(String[] args) {
//        Create an account
        BankTest myAccount = new BankTest(123456, "kandy Hamisi Said", 10_000.00);

//        Display initial account information
        myAccount.displayAccountInfo();

//        Perform operations (deposit, withdraw)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawalAmount);

//        Display final account information
        myAccount.displayAccountInfo();

        scanner.close();
    }
}
