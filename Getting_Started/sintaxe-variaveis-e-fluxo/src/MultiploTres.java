/*
 	Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
*/

public class MultiploTres {

	public static void main(String[] args) {
		for(int contador = 0; contador <= 100; contador++) {
			if (contador % 3 == 0) {
				System.out.println(contador);
			}
		}
	}

}
