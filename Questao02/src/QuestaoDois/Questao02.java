package QuestaoDois;
import java.util.*;

public class Questao02 {
	
	public static void main(String[] args) {
		double v1, v2, res;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro eletrodoméstico!");
		v1 = teclado.nextDouble();
		if (v1 > 0) {
			System.out.println("Digite o valor do segundo eletrodoméstico!");
			v2 = teclado.nextDouble();
			if (v2 > 0) {
				res = v1+v2;
				if (res >= 200) {
					if (res >= 1000) {
						System.out.println("Desconto de 25% aplicado!");
						res = res - res*0.25;
					} else {
						System.out.println("Desconto de 20% aplicado!");
						res = res - res*0.2;
					}
				}
				System.out.println("Valor de compra final: R$ "+res);
			} else {
				System.out.println("Valor Inválido!");
			}
		} else {
			System.out.println("Valor Inválido!");
		}
		
	}
	
}
