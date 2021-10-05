import java.util.*;
public class PraticaQuatorze {

	public static void main(String[] args) {
		int semana;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número em um intervalo de 1 a 7! (representando um dia da semana)");
		
		semana = teclado.nextInt();
		
		switch(semana) {
			case 1 : System.out.println("É Domingo!"); break;
			case 2 : System.out.println("É Segunda-feira!"); break;
			case 3 : System.out.println("É Terça-feira!"); break;
			case 4 : System.out.println("É Quarta-feira!"); break;
			case 5 : System.out.println("É Quinta-feira!"); break;
			case 6 : System.out.println("É Sexta-feira!"); break;
			case 7 : System.out.println("É Sábado!"); break;
			default : System.out.println("Número inválido!");
		}
		
		
		
	}

}
