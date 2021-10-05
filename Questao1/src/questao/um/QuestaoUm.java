package questao.um;

import java.util.Scanner;

public class QuestaoUm {
	
	public static void main(String[] args) {
		
		int anos=0, meses=0, dias=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seus anos de vida expressos em anos, meses, e dias!");
		System.out.println("Digite o anos!");
		anos = teclado.nextInt();
		
		System.out.println("Digite os meses!");
		meses = teclado.nextInt();
		
		System.out.println("Digite os dias!");
		dias = teclado.nextInt();
		
		dias += ((anos*365)+(meses*30));
		
		System.out.println("Você já viveu por "+dias+" dias!");
	}
	
}
