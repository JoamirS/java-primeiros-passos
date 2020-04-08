
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Apesar de não ter 18 anos, você está liberado a entrar.");
			} else {

				System.out.println("Infelizmente você não pode entrar.");
			}
		}

	}
}