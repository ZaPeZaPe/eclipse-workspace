import java.util.*;

public class Pratica15 {

	public static void main(String[] args) {
		int val;
		double v1, v2, res;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro número!");
		v1 = teclado.nextDouble();
		if(v1 >= 1) {
			System.out.println("Digite o segundo número!");
			v2 = teclado.nextDouble();
			if(v2 >= 1) {
				System.out.println("Digite qual operação deseja realizar!");
				System.out.printf("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");

				val = teclado.nextInt();

				switch(val) {
				case 1 : res = v1 + v2;
				System.out.println("Soma realizada entre "+v1+" e "+v2+" resultou no valor "+res); break;
				case 2 : res = v1 - v2;
				System.out.println("Subtração realizada entre "+v1+" e "+v2+" resultou no valor "+res); break;
				case 3 : res = v1 * v2;
				System.out.println("Multiplicação realizada entre "+v1+" e "+v2+" resultou no valor "+res); break;
				case 4 : res = v1 / v2;
				System.out.println("Divisão realizada entre "+v1+" e "+v2+" resultou em "+res); break;
				default : System.out.println("Operação inválida!");
				}

			} else {
				System.out.println("O número deve ser maior ou igual a 1!");
			}
		} else {
			System.out.println("O número deve ser maior ou igual a 1!");
		}
	}

}
