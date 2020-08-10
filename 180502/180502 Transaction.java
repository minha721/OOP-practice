import java.util.ArrayList;

public class Transaction{
	java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	private ArrayList<Transaction> transaction = new ArrayList<>();
	
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transaction = transaction;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance -=amount;
	}

	public static void main(String[] args) {
		Account1 account = new Account1("George", 1122, 1000);
		account.setAnnualInterestRate(1.65);
		account.deposit(30.0);
		account.deposit(40.0);
		account.deposit(50.0);
		account.withdraw(5.0);
		account.withdraw(4.0);
		account.withdraw(2.0);
		printAccount(account);
		print(account);
	}

	public static void printAccount(Account1 account) {
		System.out.println("Name: " + account.name);
		System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
		System.out.println("Balance: " + account.getBalance());
	}

	public static void print(Account1 account) {
		System.out.println("Date\t\t\t\tType\tAmount\tBalance");
		for (int i = 0; i < account.transaction.size(); i++) {
			System.out.println(account.getDateCreated() + "\t" + account.transaction.get(i).type + "\t"
					+ account.transaction.get(i).amount + "\t" + account.transaction.get(i).balance);
		}
	}
}
