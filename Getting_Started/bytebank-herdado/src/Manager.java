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