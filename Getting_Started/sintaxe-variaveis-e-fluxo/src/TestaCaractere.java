
public class TestaCaractere{

    public static void main(String[] args){

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;           // Compila!
        System.out.println(valor);

        valor = valor + 1;         // Não compila!
        System.out.println(valor);
    }
}

/*
Quando escrevemos essa soma, o Java automaticamente transforma o 
resultado para o maior tipo, que nesse caso é int, já que o número 1 é um inteiro.
*/

public class TestaCaractere{

    public static void main(String[] args){

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         // Compila!
        System.out.println(valor);
        
        String frase = "Tipo String é sempre declarado entre aspas duplas";
        System.out.println(frase);
    }
}

/*
Para que o código fosse compilado, utilizamos a ferramenta casting, que diz para o Java
explicitamente que queremos guardar a váriavel no tipo char.
*/