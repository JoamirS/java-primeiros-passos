public class Manager extends Employee {

	public Manager(String nameEmployee, String cpfEmployee, double salaryEmployee) {
		super(nameEmployee, cpfEmployee, salaryEmployee);

	}

	private int passwordManager;

	public void setPassManager(int password) {
		this.passwordManager = password;
	}

	public boolean authentication(int password) {
		if (this.passwordManager == password) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonus() {
		return super.getBonus() + super.getSalaryEmployee();
	}

}

/*
 * Uma classe pode ter várias filhas, mas apenas uma mãe.
 * A partir de uma instancia de uma classe filha, podemos chamar qualquer método público que tenha,
 * 	sido declarado na classe mãe. 
 */