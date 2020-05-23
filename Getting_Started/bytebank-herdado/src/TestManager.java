
public class TestManager {

	public static void main(String[] args) {
		Manager Microsoft = new Manager("Tânia Cosentino", "20220220205", 70000.00);
		
		System.out.println("Nome: " + Microsoft.getNameEmployee());
		System.out.println("CPF: " + Microsoft.getCpfEmployee());
		System.out.println("Salário: " + Microsoft.getSalaryEmployee());
		
		Microsoft.setPassManager(2222);
		boolean authenticated = Microsoft.authentication(2222);
		
		System.out.println(authenticated);
		System.out.println(Microsoft.getBonus());
	}

}