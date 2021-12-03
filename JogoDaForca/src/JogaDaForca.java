import java.util.*;
public class JogaDaForca {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] frases = {"borboleta", "cachorro", "passarinho", "flor"};
        int index = new Random().nextInt(3);
        String palavraSelecionada = frases[index];

        char[] traco = new char[palavraSelecionada.length()];
        for (int i = 0; i < palavraSelecionada.length(); i++) {
            traco[i] = '_';
        }

        int palavraString = frases[index].length();
        int tentativa = 6;

        while (palavraString > 0 && tentativa > 0) {
        	enforcado(6-tentativa);
            for (int i = 0; i < palavraSelecionada.length(); i++) {
                System.out.print(" " + traco[i] + "  ");
            }
            System.out.println("");

            System.out.println("Você tem  " + tentativa + "  chances de adivinhar");
            System.out.println("A palavra tem " + palavraString + " letras restantes");
            System.out.println("Digite uma letra: ");
            
            char letra = teclado.next().charAt(0);
            char letras = Character.toLowerCase(letra);
            boolean letraCorreta = false;
            
            for (int i = 0; i < traco.length; i++) {

                if (frases[index].charAt(i) == letras) {
                    traco[i] = letras;
                    palavraString--;
                    letraCorreta = true;
                }
            }

            if (!letraCorreta) {
                tentativa--;
            }
        }

        if (palavraString == 0) {
            System.out.println(" PARABENS! Você Acertou a palavra! ");
        } else {
        	enforcado(6);
            System.out.println("Infelizmente Você Errou ");
            System.out.println("A palavra era " + palavraSelecionada);
        }
    }
	
	public static void enforcado(int num) {
		switch(num) {
		case 0: System.out.println(" ______________\n|              |\n|              |\n|              \n|               \n|               \n|               \n|               \n|");break;
		case 1: System.out.println(" ______________\n|              |\n|              |\n|              o\n|               \n|               \n|               \n|               \n|");break;
		case 2: System.out.println(" ______________\n|              |\n|              |\n|              o\n|              |\n|                \n|               \n|              \n|");break;
		case 3: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\n|                \n|               \n|              \n|");break;
		case 4: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|               \n|               \n|              \n|");break;
		case 5: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|             /\n|               \n|              \n|");break;
		case 6: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|             / \\\n|               \n|              \n|");break;
		default: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|             / \\\n|               \n|              \n|");
		}
	}
}
