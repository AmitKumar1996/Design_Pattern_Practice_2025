package Static;

public class BankAccountSimulation {

    // Custom Exception for Invalid Transactions
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // Shared Bank Account Class
    static class BankAccount {
        private int balance;

        public BankAccount(int initialBalance) {
            this.balance = initialBalance;
        }

        // Synchronized deposit method
        public synchronized void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted invalid deposit: " + amount);
            }
        }

        // Synchronized withdraw method with exception handling
        public synchronized void withdraw(int amount) throws InsufficientFundsException {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", New Balance: " + balance);
            } else {
                throw new InsufficientFundsException("Attempt to withdraw " + amount + " failed. Available balance: " + balance);
            }
        }

        public int getBalance() {
            return balance;
        }
    }

    // Thread class to simulate user transactions
    static class UserTransaction extends Thread {
        private BankAccount account;
        private int depositAmount;
        private int withdrawAmount;

        public UserTransaction(BankAccount account, int depositAmount, int withdrawAmount) {
            this.account = account;
            this.depositAmount = depositAmount;
            this.withdrawAmount = withdrawAmount;
        }

        @Override
        public void run() {
            try {
                account.deposit(depositAmount);
                account.withdraw(withdrawAmount);
            } catch (InsufficientFundsException e) {
                System.out.println(Thread.currentThread().getName() + " - " + e.getMessage());
            }
        }
    }

    // Main method to simulate multiple users
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000); // Initial balance

        // Simulate multiple user threads
        Thread user1 = new UserTransaction(sharedAccount, 500, 700);
        Thread user2 = new UserTransaction(sharedAccount, 300, 400);
        Thread user3 = new UserTransaction(sharedAccount, 100, 800); // This may cause InsufficientFundsException
        Thread user4 = new UserTransaction(sharedAccount, 200, 150);

        // Start all threads
        user1.setName("User1");
        user2.setName("User2");
        user3.setName("User3");
        user4.setName("User4");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}