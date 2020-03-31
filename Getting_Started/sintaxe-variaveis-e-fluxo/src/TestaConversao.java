
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		float pontoFlutuante = 3.14f;
		/* Quando queremos realizar uma conversão que não pode ocorrer de forma automática,
		é necessário que façamos um processo chamado de casting 
		 */
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 12452253351L;
		short valorPequeno = 2131;
		byte binario = 127;
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double valorTotal = valor1 + valor2;
        /* Como será constatado na instrução print abaixo, double não é a melhor maneira de
        armazenar valores monetários */
		
		System.out.println(valorTotal);
		
	}
}
