import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int ano, mes;
		
		System.out.println("Digite o ano que deseja consultar!");
		ano = teclado.nextInt();
		if (ano>=1900 && ano<= 2020) {
			System.out.println("Digite o número correspondente ao mês que deseja consultar!");
			mes = teclado.nextInt();
			
			switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("31 dias");break;
				
			case 2: if (ano%4==0) {
						if(ano%100==0) {
							if(ano%400==0) {
								System.out.print("29 dias"); break;
							} else {
								System.out.print("28 dias"); break;
							}
						} else {
							System.out.print("29 dias"); break;
						}
					} else {
						System.out.print("28 dias"); break;
					}
				
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("30 dias");break;
			default: System.out.println("O mês inserido é inválido!");
			}
		} else {
			System.out.println("O ano inserido é inválido!");
		}

	}

}
