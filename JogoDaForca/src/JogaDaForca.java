import java.util.*;
public class JogaDaForca {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] frases = {"borboleta", "cachorro", "passarinho", "flor"};
        int index = new Random().nextInt(3);
        System.out.print(index);
        String palavraSelecionada = frases[index];

        char[] traco = new char[palavraSelecionada.length()];
        for (int i = 0; i < palavraSelecionada.length(); i++) {
            traco[i] = '_';
        }

        int palavraString = frases[index].length();
        int tentativa = 6;

        while (palavraString > 0 && tentativa > 0) {
            System.out.println("");
            for (int i = 0; i < palavraSelecionada.length(); i++) {
                System.out.print("  " + traco[i] + "  ");
            }
            System.out.println("");

            System.out.println("Você tem  " + tentativa + "  chances de adivinhar");
            System.out.println("A palavra tem " + palavraString + " letras restantes");
            System.out.println("Digite uma letra: ");
            //teclado.nextLine();
            char letras = teclado.next().charAt(0);
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
            System.out.println("Infelizmente Você Errou ");
            System.out.println("A palavra era " + palavraSelecionada);
        }
    }

}
