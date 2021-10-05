package QuestaoTres;
import java.util.*;

public class Questao03 {

	public static void main(String[] args) {
		double v1, res;
		char C, c;
		Scanner teclado = new Scanner(System.in);
		
		//a) 1,00 real = 0,19 dólares
		//c) 1,00 real = 0,16 euros
		//d) 1,00 euro = 6,30 reais
		//f) 1,00 euro = 1,17 dólares
		//e) 1,00 dólar = 0,86 euros
		//b) 1,00 dólar = 5,39 reais
		
		System.out.println("Digite a qual é a moeda inicial para realizar a conversão!");
		System.out.printf("Moedas aceitas: \nDolar\nEuro\nReal\n");
		C = teclado.next().charAt(0);
		c = Character.toLowerCase(C);
		if (c == 'd') {
			System.out.println("Digite para qual moeda quer converter!");
			System.out.printf("Conversões disponíveis: \nEuro\nReal\n");
			C = teclado.next().charAt(0);
			c = Character.toLowerCase(C);
			if (c == 'e') {
				System.out.println("Digite a quantidade que deseja converter de Dólar para Euro!");
				v1 = teclado.nextDouble();
				res = v1*0.86;
				System.out.println("Valor de US$ "+v1+" convertido em € "+res);				
			} else if (c == 'r') {
				System.out.println("Digite a quantidade que deseja converter de Dólar para Real!");
				v1 = teclado.nextDouble();
				res = v1*5.39;
				System.out.println("Valor de US$ "+v1+" convertido em R$ "+res);
			} else {
				System.out.println("Coversão não disponível!");
			}
			
		} else if (c == 'e') {
			System.out.println("Digite para qual moeda quer converter!");
			System.out.printf("Conversões disponíveis: \nDolar\nReal\n");
			C = teclado.next().charAt(0);
			c = Character.toLowerCase(C);
			if (c == 'd') {
				System.out.println("Digite a quantidade que deseja converter de Euro para Dólar!");
				v1 = teclado.nextDouble();
				res = v1*1.17;
				System.out.println("Valor de € "+v1+" convertido em US$ "+res);				
			} else if (c == 'r') {
				System.out.println("Digite a quantidade que deseja converter de Euro para Real!");
				v1 = teclado.nextDouble();
				res = v1*6.30;
				System.out.println("Valor de € "+v1+" convertido em R$ "+res);
			} else {
				System.out.println("Coversão não disponível!");
			}
		} else if (c == 'r') {
			System.out.println("Digite para qual moeda quer converter!");
			System.out.printf("Conversões disponíveis: \nDolar\nEuro\n");
			C = teclado.next().charAt(0);
			c = Character.toLowerCase(C);
			if (c == 'd') {
				System.out.println("Digite a quantidade que deseja converter de Real para Dolar!");
				v1 = teclado.nextDouble();
				res = v1*0.19;
				System.out.println("Valor de R$ "+v1+" convertido em US$ "+res);				
			} else if (c == 'e') {
				System.out.println("Digite a quantidade que deseja converter de Real para Euro!");
				v1 = teclado.nextDouble();
				res = v1*0.16;
				System.out.println("Valor de R$ "+v1+" convertido em € "+res);
			} else {
				System.out.println("Coversão não disponível!");
			}
		} else {
			System.out.println("Coversão não disponível!");
		}

	}

}
