package problemas;

import java.util.*;

public class praticas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1, v2, v3;
		
		System.out.println("Digite 3 valores inteiros (entre 10 e 90)");
		System.out.println("Digite o primeiro valor!");
		v1 = teclado.nextInt();
		if (v1 >= 10 && v1 <= 90) {
			System.out.println("Digite o segundo valor!");
			v2 = teclado.nextInt();
			if (v2 >= 10 && v2 <= 90) {
				System.out.println("Digite o terceiro valor!");
				v3 = teclado.nextInt();
				if (v3 >= 10 && v3 <= 90) {
					if (v1 != v2 && v1 != v3 && v2 != v3) {
						if (v1 > v2 && v1 > v3) {
							System.out.println(v1 + " é o maior valor!");
						} else if (v2 > v3 && v2 > v1) {
							System.out.println(v2 + " é o maior valor!");
						} else {
							System.out.println(v3 + " é o maior valor!");
						}
					} else {
						System.out.println("Não insira valores repetidos!");
					}
				} else {
					System.out.println("Digite apenas valores dentro do intervalo!");
				}
			} else {
				System.out.println("Digite apenas valores dentro do intervalo!");
			}
		} else {
			System.out.println("Digite apenas valores dentro do intervalo!");
		}
	}
}
