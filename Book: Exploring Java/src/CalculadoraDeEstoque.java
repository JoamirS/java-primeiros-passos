
public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		double bookjava8 = 59.90;
		double bookTDD = 59.90;
		
		double sumBooks = bookjava8 + bookTDD;
		
		System.out.println("O total em estoque é " + sumBooks);
		
		if (sumBooks < 150) {
			System.out.println("O estoque está baixo.");
		} else if (sumBooks >= 2000){
			System.out.println("O estoque está muito alto.");
		} else {
			System.out.println("O total de livros está com uma boa margem.");
		}
	}
}