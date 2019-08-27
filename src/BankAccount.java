
public class BankAccount {

	private int AccountNo, Balance;
	private String Name, Type;
	private static float TotalWithdrawl, TotalDeposit;

	public BankAccount(int ac, String name, int balance, String Type) {
		this.AccountNo = ac;
		this.Name = name;
		this.Balance = balance;
		this.Type = Type;
	}

	/*
	 * public void initializeAccount(int ac, String name, int balance, String Type)
	 * { this.AccountNo = ac; this.Name = name; this.Balance = balance; this.Type =
	 * Type; }
	 */

	public void ShowDetail() {
		System.out.println("Account No. is" + this.AccountNo + "  " + "Name is" + this.Name + "  " + "Balance Is"
				+ this.Balance + "  " + "Account Type is" + this.Type);
	}

	public void withDraw(int amount) {
		if (amount > this.Balance)
			System.out.println("You Don't have sufficient balance");
		else {
			this.Balance = this.Balance - amount;
			System.out.println("WithDraw Successfully Rs." + amount);
			TotalWithdrawl += amount;
		}
	}

	public void Deposit(int amount) {
		this.Balance = this.Balance + amount;
		System.out.println("Deposited Successfully Rs." + amount);
		TotalDeposit += amount;
	}

	public static void BalanceAvg(BankAccount... A) {
		int total = 0;
		for (BankAccount s : A)
			total = total + s.Balance;
		System.out.println("Average Balance is Rs." + (total / A.length));

	}

	public static void TotalDeposit() {
		System.out.println("Total Deposit is Rs." + TotalDeposit);
		System.out.println("Total WithDraw is Rs." + TotalWithdrawl);

	}

	public static void main(String[] args) {

		BankAccount B1 = new BankAccount(101, "Akshay", 50000, "Current");
		BankAccount B2 = new BankAccount(102, "Chirag", 70000, "Saving");
		// B1.initializeAccount(101, "Akshay", 50000, "Current");
		// B2.initializeAccount(102, "Chirag", 70000, "Saving");

		B1.ShowDetail();
		B2.ShowDetail();
		B1.withDraw(200);
		B2.withDraw(500);
		B1.Deposit(200);
		B2.Deposit(500);
		BankAccount.TotalDeposit();
		BankAccount.TotalDeposit();
		BankAccount.BalanceAvg(B1, B2);
	}

}
