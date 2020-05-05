package encapsulamento;

public class TestGetESet {
	public static void main(String[] args) {
		Account joamirAccount = new Account(3041, 0001);
		System.out.println(joamirAccount.getBankAccountNumber());

		Client joamirClient = new Client();
		joamirAccount.setOwnerAccount(joamirClient);

		joamirClient.setClientName("Joamir Silveira");
		joamirClient.setClientcpf("00100100101");
		joamirAccount.getOwnerAccount().setClientProfession("Developer");

		System.out.println("CPF: " + joamirAccount.getOwnerAccount().getClientcpf());
		System.out.println("Nome : " + joamirAccount.getOwnerAccount().getClientName());
		System.out.println("Profissão : " + joamirAccount.getOwnerAccount().getClientProfession());
	}
}