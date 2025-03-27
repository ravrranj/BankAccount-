


class BankAccount {
    private String accountHolder;
    private double balance; // Private variable (Encapsulation)


    //Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    //Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    //Setter for account holder(validation added)
    public void setAccountHolder(String accountHolder){
        if (accountHolder.length() > 2) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Name too short!");
        }
    }

    //Getter for balance(read only)
    public double getBalance() {
        return balance;
    }

    //Setter for balance is **NOT** provided to prevent direct modification

    //Method to deposit money (with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposite amount must be positive.");
        }
    }
    //method to withdraw money(with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class  Main{
    public static void main(String[] args) {
        
        //creating the bank account for the user

        BankAccount acc = new BankAccount("Chunchun", 378299);

        //Accessing account detail using getters
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Current Balance: $" + acc.getBalance());

        //Depositing money
        acc.deposit(49000);
        System.out.println("Updated Balance: $" + acc.getBalance());

        //Withdrawing money
        acc.withdraw(157200);
        System.out.println("Updated Balance: $" + acc.getBalance());

        //Trying to withdraw more than avaialble balance
        acc.withdraw(4000000);

        //changing the account holder's name with validation
        acc.setAccountHolder("Chun"); //Invalid too short (authentication failed)
        acc.setAccountHolder("Ravi Ranjan"); //Valid

        //Printing final details
        System.out.println("Updated Account Holder: " + acc.getAccountHolder());
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}