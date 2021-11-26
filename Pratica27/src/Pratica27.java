import java.util.Scanner;

public class Pratica27 {

	public static void main(String[] args) {
		resultado(obterOperacao(),obterDados(1),obterDados(2));
	}
	
	public static double soma(double v1, double v2) {
		return v1+v2;
	}
	
	public static double subtracao(double v1, double v2) {
		return v1-v2;
	}
	
	public static double multiplicacao(double v1, double v2) {
		return v1*v2;
	}
	
	public static double divisao(double v1, double v2) {
		return v1/v2;
	}
	
	public static int obterOperacao() {
		Scanner teclado = new Scanner(System.in);
		int i=0, x;
		
		imprimir("Digite qual operação deseja realizar:\n"
				+"Opção 1: Soma\n"
				+"Opção 2: Subtração\n"
				+"Opção 3: Multiplicação\n"
				+"Opção 4: Divisão");
		
		x = teclado.nextInt();
		return x;
	}
	
	public static double obterDados(int y) {
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		imprimir("Digite o "+y+"° número para realizar a operação!");
		valor = teclado.nextDouble();

		return valor;
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	
	public static void resultado(int x, double v1, double v2) {
		
		switch(x) {
		case 1: imprimir("Valor resultante da soma dos valores : " + soma(v1, v2));
		break;
		case 2: imprimir("Valor resultante da subtração dos valores : " + subtracao(v1, v2));
		break;
		case 3: imprimir("Valor resultante da multiplicação dos valores : " + multiplicacao(v1, v2));
		break;
		case 4: imprimir("Valor resultante da divisão dos valores : " + divisao(v1, v2));
		break;
		default: imprimir("Opção inválida!");
		
		}
	}
}
