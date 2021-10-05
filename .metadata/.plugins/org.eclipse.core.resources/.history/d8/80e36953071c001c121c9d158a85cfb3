package questao.quatro;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoQuatro {
	
	public static void main(String[] args) {
		
		int i, maior=0, soma=0;
		float res=0;
		String nome="";
		
		System.out.println("Digite os seguintes dados de 12 jogadores de basquete:");
		System.out.println("Nome - Altura");
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> alturas = new ArrayList<Integer>();
		
		Scanner teclado = new Scanner(System.in);
		
		for(i=0; i<12; i++) {
			System.out.println("Digite o nome do " + (i+1) + "° jogador");
			nomes.add(teclado.nextLine());
		}
		
		for(i=0; i<12; i++) {
			System.out.println("Digite a altura de " + nomes.get(i) + " em centímetros");
			alturas.add(teclado.nextInt());
		}
		
		for(i=0; i<12; i++) {
			if (alturas.get(i)>maior) {
				maior = alturas.get(i);
				nome = nomes.get(i);
			}
		}
		
		System.out.println(nome + " é o maior jogador com uma altura de " + maior + " centímetros!");
		
		for(i=0; i<12; i++) {
			soma += alturas.get(i);
		}
		
		res = soma/12;
		
		for(i=0; i<12; i++) {
			if (alturas.get(i)>res) {
				System.out.println(nomes.get(i)+" tem uma altura acima da média!");
			}
		}
	}
}
