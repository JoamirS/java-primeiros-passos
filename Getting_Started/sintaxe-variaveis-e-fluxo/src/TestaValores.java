
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 1;
		int segundo = 2;
		
		segundo = primeiro;
		primeiro = 3;
		
		System.out.println(primeiro);
		System.out.println(segundo);
	}
}
