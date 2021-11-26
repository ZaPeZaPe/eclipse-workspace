package Problema02;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		converter(obterEscolha());
	}
	
	public static double realDolar(double valor) {
		return valor*0.18;
	}
	
	public static double dolarReal(double valor) {
		return valor/0.18;
	}
	
	public static double realEuro(double valor) {
		return valor*0.16;
	}
	
	public static double euroReal(double valor) {
		return valor/0.16;
	}
	
	public static int obterEscolha() {
		Scanner teclado = new Scanner(System.in);
		int i=0, x;
		
		imprimir("Digite a op��o da convers�o que deseja fazer:\n"
				+"Op��o 1: Real -> Dolar\n"
				+"Op��o 2: Dolar -> Real\n"
				+"Op��o 3: Real -> Euro\n"
				+"Op��o 4: Euro -> Real");
		
		x = teclado.nextInt();
		return x;
	}
	
	public static double obterValor() {
		Scanner teclado = new Scanner(System.in);
		int i=0;
		double valor=11;
		
		imprimir("Digite o valor que deseja converter!");
		
		while (i!=1) {
			
			valor = teclado.nextDouble();
			
			if (valor>0) {
				i++;
			} else {
				imprimir("O valor informado n�o pode ser 0!\n"
						+"Digite o valor que deseja converter novamente!");
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
	
	public static void converter(int x) {
		
		switch(x) {
		case 1: imprimir("Valor resultante da convers�o || Real -> Dolar || : " + realDolar(obterValor()));
		break;
		case 2: imprimir("Valor resultante da convers�o || Dolar -> Real || : " + dolarReal(obterValor()));
		break;
		case 3: imprimir("Valor resultante da convers�o || Real -> Euro || : " + realEuro(obterValor()));
		break;
		case 4: imprimir("Valor resultante da convers�o || Euro -> Real || : " + euroReal(obterValor()));
		break;
		default: imprimir("Op��o inv�lida!");
		
	}
	}
}
