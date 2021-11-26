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
		
		imprimir("Digite a opção da conversão que deseja fazer:\n"
				+"Opção 1: Real -> Dólar Americano\n"
				+"Opção 2: Real -> Euro\n"
				+"Opção 3: Real -> Libra Esterlina\n"
				+"Opção 4: Dólar Americano -> Real\n"
				+"Opção 5: Euro -> Real\n"
				+"Opção 6: Libra Esterlina -> Real\n"
				+"Opção 7: Dólar Americano -> Euro\n"
				+"Opção 8: Euro -> Dólar Americano\n"
				+"Opção 9: Libra Esterlina -> Dólar Americano\n"
				+"Opção 10: Dólar Americano -> Libra Esterlina\n"
				+"Opção 11: Euro -> Libra Esterlina\n"
				+"Opção 12: Libra Esterlina -> Euro\n");
		
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
				imprimir("O valor informado não pode ser 0!\n"
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
		case 1: imprimir("Valor resultante da conversão || Real -> Dólar Americano || : " + realDolar(obterValor()));
		break;
		case 2: imprimir("Valor resultante da conversão || Real -> Euro || : " + dolarEuro(obterValor()));
		break;
		case 3: imprimir("Valor resultante da conversão || Real -> Libra Esterlina || : " + realLibra(obterValor()));
		break;
		case 4: imprimir("Valor resultante da conversão || Dólar Americano -> Real || : " + dolarReal(obterValor()));
		break;
		case 5: imprimir("Valor resultante da conversão || Euro -> Real || : " + euroReal(obterValor()));
		break;
		case 6: imprimir("Valor resultante da conversão || Libra Esterlina -> Real || : " + libraReal(obterValor()));
		break;
		case 7: imprimir("Valor resultante da conversão || Dólar Americano -> Euro || : " + dolarEuro(obterValor()));
		break;
		case 8: imprimir("Valor resultante da conversão || Euro -> Dólar Americano || : " + euroDolar(obterValor()));
		break;
		case 9: imprimir("Valor resultante da conversão || Libra Esterlina -> Dólar Americano || : " + libraDolar(obterValor()));
		break;
		case 10: imprimir("Valor resultante da conversão || Dólar Americano -> Libra Esterlina || : " + dolarLibra(obterValor()));
		break;
		case 11: imprimir("Valor resultante da conversão || Euro -> Libra Esterlina || : " + euroLibra(obterValor()));
		break;
		case 12: imprimir("Valor resultante da conversão || Libra Esterlina -> Euro || : " + libraEuro(obterValor()));
		break;
		default: imprimir("Opção inválida!");
		
	}
	}
}
