import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc = new Scanner(System.in);
 
    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    //Display ATM Menu
    public void showMenu() {

        int choice;

        do {
            System.out.println("\n--- WELCOME TO ATM---");
            System.out.println("1--> Withdraw");
            System.out.println("2--> Deposit");
            System.out.println("3--> Check Balance");
            System.out.println("4--> Exit");
            System.out.print("Enter your select Mode : ");

            choice = sc.nextInt();

            switch (choice) {
                
    
        
                case 1:
                    System.out.println("Enter the Amount you withdraw: ");
                   double withdrawAmount = sc.nextDouble();
                   withdraw(withdrawAmount);
                   break;
                case 2:
                    System.out.print("Enter  the Amount you  deposit: ");
                    double depositeAmount =sc.nextDouble();
                    deposit(depositeAmount);
                    break;

                case 3:
                    checkBalance();
                    break;
                   

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println(" oops...Invalid Choice!");
            }
    
         } 
    while (choice != 4);
}

    

    // Withdraw Method
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    // Deposit Method
    public void deposit(double amount) {
        account.deposit(amount);
    }

    // Check Balance Method
    public void checkBalance() {
        account.checkBalance();
    }
}
 class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful.");
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
       class Main {

    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount(5000);

        ATM atm = new ATM(userAccount);

        atm.showMenu();
    }
}