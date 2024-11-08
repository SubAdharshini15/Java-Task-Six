package Programs;

public class Account {
	private String accountHolderName;
	private int accountNumber;
	private double balance;

	public Account() {
		System.out.println("Account Details");
	}
	public Account(String name,int accountnumber) {
		this.accountHolderName = name;
		this.accountNumber = accountnumber;
		this.balance = 0.0;
	}
	public String getName() {
		return accountHolderName;
	}
	public int getNumebr() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount >0) {
			balance = balance + amount ;
			System.out.println("Balance after deposit : " +balance);
		}
		else {
			System.out.println("Amount should be greater than zero to deposit");
		}
	}
	public void withdraw(double amount) {
		if(amount>0) {
			if(amount < balance) {
				balance = balance - amount;
				System.out.println("Amount after withdrawal : "+balance);
			}
			else {
				System.out.println("Insufficient Balance ");
			}
		}
		else {
			System.out.println("Amount must be lesser than balance to withdraw");
		}
	}
	public void checkBalance() {
		System.out.println("Current Balance : "+balance);
	}
	public void accountDetails() {
		System.out.println("Account HolderName : "+accountHolderName);
		System.out.println("Account Number : "+accountNumber);
		checkBalance();
	}
	public static void main(String[] args) {
		new Account();
		Account a = new Account("Suba", 123456);
		a.accountDetails();
		a.deposit(1000);
		a.checkBalance();
		a.withdraw(250);
		a.checkBalance();
	}
}
