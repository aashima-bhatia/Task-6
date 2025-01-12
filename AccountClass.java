package task;

public class AccountClass {

		// Data members
		private String accountHolderName;
		public double balance;
		// no-argument constructor
		public AccountClass() {
			this.accountHolderName = "Unknown";
			this.balance = 0.0;
		}
		// Constructor with two arguments
	    public AccountClass(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	    }
	    // method to deposit money
	    public void deposit(double amount) {
	    	if(amount>0) {
	    		balance += amount;
	    		System.out.println("Deposited: " + amount);
	    	}else {
	    		System.out.println("Deposit amount must be greater than zero.");
	    	}
	    }
	    // method to withdraw money
	    public void withdraw(double amount) {
	    	if(amount>0 && amount<=balance) {
	    		balance -= amount;
	    		System.out.println("Withdrwan: " + amount);
	    	}else if(amount>balance) {
	    		System.out.println("Insufficient balance..");
	    	}else {
	    		System.out.println("Withdrawal amount must be greater than zero.");
	    	}
	    }
	    // method to check balance
	    public double checkBalance() {
	    	return balance;
	    }
	    
	    public static void main(String[] args) {
	    	// using no-argument constructor
	    	AccountClass account = new AccountClass();
	    	System.out.println("Account: "+account.accountHolderName+", Bal: "+account.checkBalance());
	    	// using argument constructor
	    	AccountClass account1 = new AccountClass("Aashima Batia",10000.0);
	    	System.out.println("Account1: "+account.accountHolderName+", Bal: "+account.checkBalance());
	    	// deposit money 
	    	account1.deposit(1500);
	    	System.out.println("Bal after deposit: " + account1.checkBalance());
	    	// withdraw money
	    	account1.withdraw(25008.0);
	    	System.out.println("Bal after withdraw: " + account1.checkBalance());
	    	// attempt to withdraw more than balance
	    	account1.withdraw(1000000.0);
	    }

}
