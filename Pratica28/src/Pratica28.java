import java.util.*;

public class Pratica28 {

	public static void main(String[] args) {
		conversao(obterEscolha(),obterDados());
	}
		
	public static int obterEscolha() {
		Scanner teclado = new Scanner(System.in);
		int i=0, x;
		
		imprimir("Digite qual opera��o deseja realizar:\n"
				+"Op��o 1: Celsius -> Kelvin\n"
				+"Op��o 2: Kelvin -> Celsius\n"
				+"Op��o 3: Celsius -> Fahrenheit\n"
				+"Op��o 4: Fahrenheit -> Celsius\n"
				+"Op��o 5: Kelvin -> Fahrenheit\n"
				+"Op��o 6: Fahrenheit -> Kelvin");
		
		x = teclado.nextInt();
		return x;
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	
	public static double obterDados() {
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		imprimir("Digite o valor para realizar a convers�o!");
		valor = teclado.nextDouble();

		return valor;
	}
	
	public static void conversao(int x, double v1) {
		
		switch(x) {
		case 1: imprimir("Valor resultante da convers�o da temperatura em Celsius para Kelvin : " + celsiusParaKelvin(v1));
		break;
		case 2: imprimir("Valor resultante da convers�o da temperatura em Kelvin para Celsius : " + kelvinParaCelsius(v1));
		break;
		case 3: imprimir("Valor resultante da convers�o da temperatura em Celsius para Fahrenheit : " + celsiusParaFahrenheit(v1));
		break;
		case 4: imprimir("Valor resultante da convers�o da temperatura em Fahrenheit para Celsius : " + fahrenheitParaCelsius(v1));
		break;
		case 5: imprimir("Valor resultante da convers�o da temperatura em Kelvin para Fahrenheit : " + kelvinParaFahrenheit(v1));
		break;
		case 6: imprimir("Valor resultante da convers�o da temperatura em Fahrenheit para Kelvin : " + fahrenheitParaKelvin(v1));
		break;
		default: imprimir("Op��o inv�lida!");
		
		}
	}
	
	public static double celsiusParaKelvin(double valor) {
		return valor + 273;
	}
	public static double kelvinParaCelsius(double valor) {
		return valor - 273;
	}
	public static double celsiusParaFahrenheit(double valor) {
		return (valor * 1.8) + 32;
	}
	public static double fahrenheitParaCelsius(double valor) {
		return (valor - 32)/1.8;
	}
	public static double kelvinParaFahrenheit(double valor) {
		return (valor - 273) * (1.8 + 32);
	}
	public static double fahrenheitParaKelvin(double valor) {
		return ((valor - 32) * 5)/(9 + 273);
	}
	
}
