
public class TestaFatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for(int contador = 1; contador <= 10; contador++) {
			fatorial *= contador;
			System.out.println("O valor do fatorial de " + contador + " é igual a " + fatorial);
		}
	}

}