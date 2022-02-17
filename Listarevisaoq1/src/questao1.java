import java.util.*;
public class questao1 {

	public static void main(String[] args) {
		obterNotaCalcularExibirConceito();
	}

	private static void obterNotaCalcularExibirConceito() {
		int nota = obterNota();
		String conceito = calcularConceito(nota);
		
		System.out.println(conceito);
	}

	private static String calcularConceito(int nota) {
		if (nota < 0) {
			return "Nota inválida";
		} else if (nota<=49) {
			return "Insuficiente!";
		} else if (nota <= 64) {
			return "Regular!";
		} else if (nota <= 84) {
			return "Bom!";
		} else if (nota <= 100) {
			return "Ótimo!";
		}
		return "Nota inválida";
	}

	private static int obterNota() {
		System.out.print("Digite sua nota para exibir seu conceito: ");
		Scanner teclado = new Scanner(System.in);
		int nota = teclado.nextInt();
		return nota;
	}

}
