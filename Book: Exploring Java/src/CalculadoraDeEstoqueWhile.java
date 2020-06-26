
public class CalculadoraDeEstoqueWhile {
	public static void main(String[] args) {
		double sumBooks = 0;
		int	counter = 0;
		while	(counter <	35)	{
			double	bookValue	=	59.90;
			sumBooks += bookValue;
			counter	+= 1;
		}
		
		System.out.println("O total em estoque é "+	sumBooks);
		
		if (sumBooks < 150) {
			System.out.println("O estoque está baixo.");
		} else if (sumBooks >= 2000){
			System.out.println("O estoque está muito alto.");
		} else {
			System.out.println("O total de livros está com uma boa margem.");
		}
	}
}