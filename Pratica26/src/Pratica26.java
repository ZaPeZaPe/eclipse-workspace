import java.util.*;

public class Pratica26 {

	public static void main(String[] args) {

		int x=0, valor=0, i=0, y=0, z=0, soma=0;
		double p1=4, p2=6;
		int[] vet = new int[17];
		Scanner teclado = new Scanner(System.in);

		while(x!=1) {
			System.out.println("\nDigite um valor inteiro dentro do intervalo de 50 a 100!");
			valor = teclado.nextInt();

			if(valor >= 50 && valor <= 100) {
				x++;
			} else {
				System.out.println("Valor fora do intervalo apresentado... Repita o procedimento:");
			}

		}

		System.out.println("");
		while(y!=1) {
			vet[i] = 10 + (((i+1)-1)*6);
			if(valor<vet[i]) {
				y++;
				System.out.println("");
			} else {
				System.out.print(vet[i]+" ");
				i++;
			}

		}

		System.out.println("\nExistem "+i+" elementos na sequência");
		System.out.println("\nA média aritimética entre o primeiro e o ultimo valor da sequência é: "+(10+vet[i-1])/2);
		System.out.println("\nA quantidade de números pares existentes na sequência é: "+i);
		System.out.println("\nA quantidade de números ímpares existentes na sequência é: 0");
		System.out.println("\nA quantidade de números ímpares existentes na sequência que são divisíveis por 3 é: 0");

		while(z!=i) {
			soma += vet[z];
			z++;
		}

		System.out.println("\nA soma dos elementos da sequência é: "+soma);

		if(i>=10) {
			System.out.println("\nA média ponderada entre o 4° e o 10° valor da sequência é: "+(vet[3]*p1 + vet[9]*p2)/(p1+p2));
		} else {
			System.out.println("\nA média ponderada entre o 4° e o 10° valor da sequência é: 0");
		}

	}

}
