
public class RegisterOfBooks {

	public static void main(String[] args) {
		
		AuthorBooks LeandroKarnal = new AuthorBooks();
		LeandroKarnal.name = "Leandro Karnal";
		LeandroKarnal.email = "leandro.karnal@outlook.com";
		LeandroKarnal.cpf = "123.456.789.10";
		
		Book book = new Book();
		book.nameBook = "Java 8 Prático";
		book.describeBook = "Novos recursos da linguagem";
		book.valueBook = 59.90;
		book.isbnBook = "978-85-66250-46-6";
		book.author = LeandroKarnal;
		
		book.showDetailsBook();
		
		AuthorBooks PauloSilveira = new AuthorBooks();
		PauloSilveira.name = "Paulo Silveira";
		PauloSilveira.email = "paulo.silveira@caelum.com.br";
		PauloSilveira.cpf = "123.456.789.10";
		
		Book secondBook = new Book();
		secondBook.nameBook = "Java 9";
		secondBook.describeBook = "Crie seus primeiros programas";
		secondBook.valueBook = 59.90;
		secondBook.isbnBook = "978-85-66250-22-0";
		secondBook.author = PauloSilveira;
		
		secondBook.showDetailsBook();
		
	}

}