import java.util.*;
public class PraticaQuatorze {

	public static void main(String[] args) {
		int semana;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero em um intervalo de 1 a 7! (representando um dia da semana)");
		
		semana = teclado.nextInt();
		
		switch(semana) {
			case 1 : System.out.println("� Domingo!"); break;
			case 2 : System.out.println("� Segunda-feira!"); break;
			case 3 : System.out.println("� Ter�a-feira!"); break;
			case 4 : System.out.println("� Quarta-feira!"); break;
			case 5 : System.out.println("� Quinta-feira!"); break;
			case 6 : System.out.println("� Sexta-feira!"); break;
			case 7 : System.out.println("� S�bado!"); break;
			default : System.out.println("N�mero inv�lido!");
		}
		
		
		
	}

}
