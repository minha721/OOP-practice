import java.util.ArrayList;

class Account1 extends Account {
	String name;

	ArrayList<Transaction> transaction = new ArrayList<>();

	public Account1(String name, int id, int balance) {
		super(id, balance);
		this.name = name;
	}

	public class Transaction {
		java.util.Date date;
		char type;
		double amount;
		double balance;
		String description;

		public Transaction(char type, double amount, double balance, String description) {
			this.type = type;
			this.amount = amount;
			this.balance = balance;
			this.description = description;
		}
	}

	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
		transaction.add(new Transaction('W', amount, getBalance(), "Withdraw"));
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		transaction.add(new Transaction('D', amount, getBalance(), "Deposit"));
	}
}
