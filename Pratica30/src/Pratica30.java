import java.util.Scanner;

public class Pratica30 {

	public static void main(String[] args) {
		double m1,m2;
		
		m1 = primeiraUnidade(obterNota(),obterNota(),obterNota());
		
		imprimir("Média da primeira unidade: " + m1);
		
		m2 = primeiraUnidade(obterNota(),obterNota(),obterNota());
		
		imprimir("Média da segunda unidade: " + m2);
		
		imprimir("Situação do aluno: " + resultadoFinal(m1,m2));
	}
	
	public static double primeiraUnidade(double v1, double v2, double v3) {
		final double p1 = 2, p2 = 3, p3 = 5;
		return ((v1*p1)+(v2*p2)+(v3*p3))/(p1+p2+p3);
	}
	
	public static double segundaUnidade(double v1, double v2, double v3) {
		final double p1 = 3, p2 = 3, p3 = 4;
		return ((v1*p1)+(v2*p2)+(v3*p3))/(p1+p2+p3);
	}
	
	public static String resultadoFinal(double v1, double v2) {
		if(((v1+v2)/2)>=6){
			return "Aprovado!";
		}		
		return "Reprovado!";
	}
	
	public static double obterNota() {
		Scanner teclado = new Scanner(System.in);
		int i=0;
		double valor=11;
		
		imprimir("Digite a nota!");
		
		while (i!=1) {
			
			valor = teclado.nextDouble();
			
			if (valor<=10 && valor>=0) {
				i++;
			} else {
				imprimir("Valor inválido!\n"
						+ "Digite a nota novamente!");
			}
		}
		return valor;
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(double arg) {
		System.out.println(arg);
	}
}
