//Gerente é um funcionário, gerente herda da classe Funcionário
public class VideoEditor extends Employee {

	public VideoEditor(String nameEmployee, String cpfEmployee, double salaryEmployee) {
		super(nameEmployee, cpfEmployee, salaryEmployee);
	}

	public double getBonus() {
		System.out.println("Chamando o método de bonificação do editor de vídeo");
		return 150;
	}

}

/*
 * Uma classe pode ter várias filhas, mas apenas uma mãe.
 * A partir de uma instancia de uma classe filha, podemos chamar qualquer método público que tenha,
 * 	sido declarado na classe mãe. 
 */