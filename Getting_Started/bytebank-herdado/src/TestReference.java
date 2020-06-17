
public class TestReference {

	public static void main(String[] args) {
		Manager Service = new Manager("Flávia", "002.002.002-05", 8000.00);
		System.out.println(Service.getNameEmployee());
		System.out.println(Service.getCpfEmployee());
		System.out.println(Service.getSalaryEmployee());
		
		Employee DAT = new Employee("Joamir", "003.003.003-05", 1000.00);
		System.out.println(DAT.getNameEmployee());
		System.out.println(DAT.getCpfEmployee());
		System.out.println(DAT.getSalaryEmployee());
		
		VideoEditor VideoMaker = new VideoEditor("Magomitsu", "004.004.004-04", 4000.00);
		
		BonusControl controlBonus = new BonusControl();
		
		controlBonus.register(Service);
		controlBonus.register(DAT);
		controlBonus.register(VideoMaker);
		
		System.out.println(controlBonus.getSum());
	}
	
}
