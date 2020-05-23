
public class TestEmployee {
	public static void main(String[] args) {
		Employee joamir = new Employee("Joamir Silveira", "001.001.001.01", 10000.00);
		System.out.println("CPF: " + joamir.getCpfEmployee());
		System.out.println("Nome do empregado: " + joamir.getNameEmployee());
		System.out.println("Salário: " + joamir.getSalaryEmployee());
	}
}
