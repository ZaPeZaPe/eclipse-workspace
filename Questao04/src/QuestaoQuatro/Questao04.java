package QuestaoQuatro;
import java.util.*;

public class Questao04 {

	public static void main(String[] args) {
		int v1, v2, v3, menor;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um valor em um intervalo de 1 a 20!");
		v1 = teclado.nextInt();
		if (v1 >= 1 && v1 <= 20) {
			System.out.println("Digite outro valor em um intervalo de 1 a 20 não inserido anteriormente!");
			v2 = teclado.nextInt();
			if (v2 >= 1 && v2 <= 20 && v1 != v2) {
				System.out.println("Digite outro valor em um intervalo de 1 a 20 não inserido anteriormente!");
				v3 = teclado.nextInt();
				if (v3 >= 1 && v3 <= 20 && v1 != v3 && v2 != v3) {
					if (v1 > v2 && v2 > v3) {
						System.out.printf("\n%d\n%d\n%d\n",v1,v2,v3);
					} else if (v1 > v3 && v3 > v2) {
						System.out.printf("\n%d\n%d\n%d\n",v1,v3,v2);
					} else if (v2 > v1 && v1 > v3) {
						System.out.printf("\n%d\n%d\n%d\n",v2,v1,v3);
					} else if (v2 > v3 && v3 > v1) {
						System.out.printf("\n%d\n%d\n%d\n",v2,v3,v1);
					} else if (v3 > v1 && v1 > v2) {
						System.out.printf("\n%d\n%d\n%d\n",v3,v1,v2);
					} else if (v3 > v2 && v2 > v1) {
						System.out.printf("\n%d\n%d\n%d\n",v3,v2,v1);
					} 
				} else {
					System.out.println("Os valores não atendem!");
				}
			} else {
				System.out.println("Os valores não atendem!");
			}
		} else {
			System.out.println("Os valores não atendem!");
		}

	}

}
