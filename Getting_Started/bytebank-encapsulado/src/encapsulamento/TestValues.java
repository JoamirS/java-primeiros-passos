package encapsulamento;

public class TestValues {
	public static void main(String[] args) {
		Account account = new Account(2020, 0077);
		System.out.println(account.getAccountAgency());
		System.out.println(Account.getTotalAccount());
	}
}
