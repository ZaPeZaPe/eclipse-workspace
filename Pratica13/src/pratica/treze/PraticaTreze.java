package pratica.treze;
import java.util.*;

public class PraticaTreze {

	public static void main(String[] args) {
		double v1, v2, res;
		int op;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois valores para realizar uma operação matemática!");
		
		System.out.println("Digite o primeiro valor!");
		v1 = teclado.nextDouble();
		System.out.println("Digite o segundo valor!");
		v2 = teclado.nextDouble();
		
		System.out.printf("Deseja realizar qual operação?\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
		op = teclado.nextInt();
		
		if (op == 1) {
			res = v1+v2;
			System.out.println("O resultado da adição entre " + v1 + " e " + v2 + " foi: " + res);
		} else if (op == 2){
			res = v1-v2;
			System.out.println("O resultado da subtração entre " + v1 + " e " + v2 + " foi: " + res);
		} else if (op == 3){
			res = v1*v2;
			System.out.println("O resultado da multiplicação entre " + v1 + " e " + v2 + " foi: " + res);
		} else if (op == 4){
			res = v1/v2;
			System.out.println("O resultado da divisão entre " + v1 + " e " + v2 + " foi: " + res);
		} else {
			System.out.println("Opção inválida!");
		}
	}

}
