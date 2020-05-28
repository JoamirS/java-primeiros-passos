
public class TestReference {

	public static void main(String[] args) {
		Employee Service = new Manager("Flávia Aparecida", "002.002.002-05", 8000.00);
		System.out.println(Service.getNameEmployee());
		System.out.println(Service.getCpfEmployee());
		System.out.println(Service.getSalaryEmployee());
		
		Employee DAT = new Employee("Joamir", "003.003.003-05", 1000.00);
		System.out.println(DAT.getNameEmployee());
		System.out.println(DAT.getCpfEmployee());
		System.out.println(DAT.getSalaryEmployee());
		
		BonusControl controlBonus = new BonusControl();
		controlBonus.register(Service);
		System.out.println(Service);
		System.out.println(controlBonus.getSum());
		
		controlBonus.register(DAT);
		System.out.println(DAT);
		System.out.println(controlBonus.getSum());
		
	}
	
}
