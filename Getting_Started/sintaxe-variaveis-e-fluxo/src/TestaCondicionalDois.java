
public class TestaCondicionalDois {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 10;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas > 2;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Está liberado a sua entrada");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}