package QuestaoUm;
import java.util.*;

public class Questao01 {

	public static void main(String[] args) {
		double p1=3.8, p2=6.2, v1, v2, res;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota para o cáculo da média ponderada!");
		v1 = teclado.nextDouble();
		if (v1 <= 10 && v1 >= 0) {
			System.out.println("Digite a segunda nota!");
			v2 = teclado.nextDouble();
			if (v2 <= 10 && v2 >= 0) {
				System.out.println("Calculando a média ponderada das notas "+v1+" e "+v2+" .");
				res = ((v1*p1) + (v2*p2))/(p1+p2);
				if (res < 6) {
					System.out.println("Reprovado!");
				} else {
					System.out.println("Aprovado!");
				}
			} else {
				System.out.println("Nota Inválida!");
			}
		} else {
			System.out.println("Nota Inválida!");
		}
		
		

	}

}
