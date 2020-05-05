package encapsulamento;

public class Account {

	private double accountBalance;
	private int accountAgency;
	private int accountNumber;
	private Client ownerAccount;
	private static int totalAccount;

	public Account(int accountAgency, int accountNumber) {
		Account.totalAccount++;
		System.out.println("O total de contas é " + Account.totalAccount);
		this.accountAgency = accountAgency;
		this.accountNumber = accountNumber;

	}

	public void cashDeposit(double value) {
		if (value > 0) {
			this.accountBalance = this.accountBalance + value;
		}
	}

	public boolean withdrawMoney(double value) {
		if (this.accountBalance >= value && value > 0) {
			this.accountBalance -= value;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferMoney(double value, Account destiny) {
		if (this.accountBalance >= value) {
			this.accountBalance -= value;
			destiny.cashDeposit(value);
			return true;
		}
		return false;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

	public int getBankAccountNumber() {
		return this.accountNumber;
	}

	public void setBankAccountNumber(int newNumberAccount) {
		if (newNumberAccount <= 0) {
			System.out.println("Não podemos colocar número negativo como número da conta.");
		}
		this.accountNumber = newNumberAccount;
	}

	public int getAccountAgency() {
		return this.accountAgency;
	}

	public void setAccountAgency(int newAgencyAccount) {
		if (newAgencyAccount <= 0) {
			System.out.println("Não podemos colocar número negativo como número da agência.");
		}
		this.accountAgency = newAgencyAccount;
	}

	public Client getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(Client newOwner) {
		this.ownerAccount = newOwner;
	}

	public static int getTotalAccount() {
		return Account.totalAccount;
	}

}