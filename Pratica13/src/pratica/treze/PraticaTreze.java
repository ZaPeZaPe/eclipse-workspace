package pratica.treze;
import java.util.*;

public class PraticaTreze {

	public static void main(String[] args) {
		double v1, v2, res;
		int op;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois valores para realizar uma opera��o matem�tica!");
		
		System.out.println("Digite o primeiro valor!");
		v1 = teclado.nextDouble();
		System.out.println("Digite o segundo valor!");
		v2 = teclado.nextDouble();
		
		System.out.printf("Deseja realizar qual opera��o?\n1 - Adi��o\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o\n");
		op = teclado.nextInt();
		
		if (op == 1) {
			res = v1+v2;
			System.out.println("O resultado da adi��o entre " + v1 + " e " + v2 + " foi: " + res);
		} else if (op == 2){
			res = v1-v2;
			System.out.println("O resultado da subtra��o entre " + v1 + " e " + v2 + " foi: " + res);
		} else if (op == 3){
			res = v1*v2;
			System.out.println("O resultado da multiplica��o entre " + v1 + " e " + v2 + " foi: " + res);
		} else if (op == 4){
			res = v1/v2;
			System.out.println("O resultado da divis�o entre " + v1 + " e " + v2 + " foi: " + res);
		} else {
			System.out.println("Op��o inv�lida!");
		}
	}

}
