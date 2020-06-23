
public abstract class Employee {
	private String nameEmployee;
	private String cpfEmployee;
	protected double salaryEmployee;
	
	public Employee(String nameEmployee, String cpfEmployee, double salaryEmployee) {
		this.nameEmployee = nameEmployee;
		this.cpfEmployee = cpfEmployee;
		this.salaryEmployee = salaryEmployee;
	}
	
	public double getBonus() {
		return this.salaryEmployee * 0.10;
	}
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getCpfEmployee() {
		return cpfEmployee;
	}
	public void setCpfEmployee(String cpfEmployee) {
		this.cpfEmployee = cpfEmployee;
	}
	public double getSalaryEmployee() {
		return salaryEmployee;
	}
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	
}
