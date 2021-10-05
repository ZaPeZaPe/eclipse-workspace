import java.util.*;
public class Pratica16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pontos;
		char op, op1;
		
		System.out.println("Questão 01: Indique, entre as opções abaixo, um animal considerado invertebrado:\n(A) Minhoca\n(B) Aranha\n(C) Cachorro\n(D) Gato");
		op = teclado.next().charAt(0);
		op1 = Character.toLowerCase(op);
		switch(op1) {
		case 'a':
		case 'b': System.out.println("Alternativa correta"); pontos=1; break;
		case 'c':
		case 'd': System.out.println("Alternativa Errada"); pontos=0; break;
		default: System.out.println("Alternativa inválida");
		}
	}
}
