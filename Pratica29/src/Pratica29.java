import java.util.*;

public class Pratica29 {

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
	
	public static double realLibra(double valor) {
		return valor*0.13;
	}
	
	public static double libraReal(double valor) {
		return valor/0.13;
	}
	
	public static double dolarEuro(double valor) {
		return dolarReal(valor)*0.16;
	}
	
	public static double euroDolar(double valor) {
		return euroReal(valor)*0.18;
	}
	
	public static double libraDolar(double valor) {
		return libraReal(valor)*0.16;
	}
	
	public static double dolarLibra(double valor) {
		return dolarReal(valor)*0.13;
	}
	
	public static double euroLibra(double valor) {
		return euroReal(valor)*0.13;
	}
	
	public static double libraEuro(double valor) {
		return libraReal(valor)*0.16;
	}
	
	public static int obterEscolha() {
		Scanner teclado = new Scanner(System.in);
		int x;
		
		imprimir("Digite a op��o da convers�o que deseja fazer:\n"
				+"Op��o 1: Real -> D�lar Americano\n"
				+"Op��o 2: Real -> Euro\n"
				+"Op��o 3: Real -> Libra Esterlina\n"
				+"Op��o 4: D�lar Americano -> Real\n"
				+"Op��o 5: Euro -> Real\n"
				+"Op��o 6: Libra Esterlina -> Real\n"
				+"Op��o 7: D�lar Americano -> Euro\n"
				+"Op��o 8: Euro -> D�lar Americano\n"
				+"Op��o 9: Libra Esterlina -> D�lar Americano\n"
				+"Op��o 10: D�lar Americano -> Libra Esterlina\n"
				+"Op��o 11: Euro -> Libra Esterlina\n"
				+"Op��o 12: Libra Esterlina -> Euro\n");
		
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
		case 1: imprimir("Valor resultante da convers�o || Real -> D�lar Americano || : " + realDolar(obterValor()));
		break;
		case 2: imprimir("Valor resultante da convers�o || Real -> Euro || : " + dolarEuro(obterValor()));
		break;
		case 3: imprimir("Valor resultante da convers�o || Real -> Libra Esterlina || : " + realLibra(obterValor()));
		break;
		case 4: imprimir("Valor resultante da convers�o || D�lar Americano -> Real || : " + dolarReal(obterValor()));
		break;
		case 5: imprimir("Valor resultante da convers�o || Euro -> Real || : " + euroReal(obterValor()));
		break;
		case 6: imprimir("Valor resultante da convers�o || Libra Esterlina -> Real || : " + libraReal(obterValor()));
		break;
		case 7: imprimir("Valor resultante da convers�o || D�lar Americano -> Euro || : " + dolarEuro(obterValor()));
		break;
		case 8: imprimir("Valor resultante da convers�o || Euro -> D�lar Americano || : " + euroDolar(obterValor()));
		break;
		case 9: imprimir("Valor resultante da convers�o || Libra Esterlina -> D�lar Americano || : " + libraDolar(obterValor()));
		break;
		case 10: imprimir("Valor resultante da convers�o || D�lar Americano -> Libra Esterlina || : " + dolarLibra(obterValor()));
		break;
		case 11: imprimir("Valor resultante da convers�o || Euro -> Libra Esterlina || : " + euroLibra(obterValor()));
		break;
		case 12: imprimir("Valor resultante da convers�o || Libra Esterlina -> Euro || : " + libraEuro(obterValor()));
		break;
		default: imprimir("Op��o inv�lida!");
		
	}
	}
}
