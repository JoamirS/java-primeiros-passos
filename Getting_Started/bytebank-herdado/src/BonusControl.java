
public class BonusControl {

	private double sumBonus;
	
	public void register(Employee employeeBonus) {
        double bonus = employeeBonus.getBonus();
        this.sumBonus = this.sumBonus + bonus;
    }
	
	public double getSum() {
		return sumBonus;
	}
}