import java.util.*;

public class Pratica15 {

	public static void main(String[] args) {
		int val;
		double v1, v2, res;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero!");
		v1 = teclado.nextDouble();
		if(v1 >= 1) {
			System.out.println("Digite o segundo n�mero!");
			v2 = teclado.nextDouble();
			if(v2 >= 1) {
				System.out.println("Digite qual opera��o deseja realizar!");
				System.out.printf("1 - Adi��o\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o\n");

				val = teclado.nextInt();

				switch(val) {
				case 1 : res = v1 + v2;
				System.out.println("Soma realizada entre "+v1+" e "+v2+" resultou no valor "+res); break;
				case 2 : res = v1 - v2;
				System.out.println("Subtra��o realizada entre "+v1+" e "+v2+" resultou no valor "+res); break;
				case 3 : res = v1 * v2;
				System.out.println("Multiplica��o realizada entre "+v1+" e "+v2+" resultou no valor "+res); break;
				case 4 : res = v1 / v2;
				System.out.println("Divis�o realizada entre "+v1+" e "+v2+" resultou em "+res); break;
				default : System.out.println("Opera��o inv�lida!");
				}

			} else {
				System.out.println("O n�mero deve ser maior ou igual a 1!");
			}
		} else {
			System.out.println("O n�mero deve ser maior ou igual a 1!");
		}
	}

}
