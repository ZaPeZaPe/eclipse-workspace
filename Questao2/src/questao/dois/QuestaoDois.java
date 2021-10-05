package questao.dois;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro!");
		a = teclado.nextInt();
		System.out.println("Digite um outro valor inteiro");
		b = teclado.nextInt();
		
		System.out.println("Valor da primeira variavel antes: " + a );
		System.out.println("Valor da segunda variavel antes: " + b );
		c = b;
		b = a;
		a = c;
		System.out.println("Valor da primeira variavel depois: " + a );
		System.out.println("Valor da segunda variavel depois: " + b );		
	}
}
