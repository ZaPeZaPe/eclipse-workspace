import java.util.*;

public class Questao01 {

	public static void main(String[] args) {
		double v1, v2, v3, v4, v5, v6;
		
		v1 = obterValor();
		v2 = obterValor();
		v3 = obterValor();
		
		imprimir("Média da primeira unidade: " + mediaUnidade1(v1,v2,v3));
		
		v4 = obterValor();
		v5 = obterValor();
		v6 = obterValor();
		
		imprimir("Média da segunda unidade: " + mediaUnidade2(v4,v5,v6));
		
		imprimir("Média Final: " + mediaFinal(mediaUnidade1(v1,v2,v3),mediaUnidade2(v4,v5,v6)));
		
		imprimir(resultadoFinal(mediaFinal(mediaUnidade1(v1,v2,v3),mediaUnidade2(v4,v5,v6))));
	}
	
	public static double mediaUnidade1(double v1, double v2, double v3) {
		final double p1 = 2, p2 = 3, p3 = 5;
		return ((v1*p1)+(v2*p2)+(v3*p3))/(p1+p2+p3);
	}
	
	public static double mediaUnidade2(double v1, double v2, double v3) {
		final double p1 = 3, p2 = 3, p3 = 4;
		return ((v1*p1)+(v2*p2)+(v3*p3))/(p1+p2+p3);
	}
	
	public static double mediaFinal(double v1, double v2) {
		return (v1+v2)/2;
	}
	
	public static String resultadoFinal(double v1) {
		if (v1 >= 6) {
			return "Aprovado!";
		}
		return "Reprovado!";
	}
	
	public static double obterValor() {
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
