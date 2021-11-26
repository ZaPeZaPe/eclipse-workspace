import java.util.*;

public class Pratica28 {

	public static void main(String[] args) {
		conversao(obterEscolha(),obterDados());
	}
		
	public static int obterEscolha() {
		Scanner teclado = new Scanner(System.in);
		int i=0, x;
		
		imprimir("Digite qual operação deseja realizar:\n"
				+"Opção 1: Celsius -> Kelvin\n"
				+"Opção 2: Kelvin -> Celsius\n"
				+"Opção 3: Celsius -> Fahrenheit\n"
				+"Opção 4: Fahrenheit -> Celsius\n"
				+"Opção 5: Kelvin -> Fahrenheit\n"
				+"Opção 6: Fahrenheit -> Kelvin");
		
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
		
		imprimir("Digite o valor para realizar a conversão!");
		valor = teclado.nextDouble();

		return valor;
	}
	
	public static void conversao(int x, double v1) {
		
		switch(x) {
		case 1: imprimir("Valor resultante da conversão da temperatura em Celsius para Kelvin : " + celsiusParaKelvin(v1));
		break;
		case 2: imprimir("Valor resultante da conversão da temperatura em Kelvin para Celsius : " + kelvinParaCelsius(v1));
		break;
		case 3: imprimir("Valor resultante da conversão da temperatura em Celsius para Fahrenheit : " + celsiusParaFahrenheit(v1));
		break;
		case 4: imprimir("Valor resultante da conversão da temperatura em Fahrenheit para Celsius : " + fahrenheitParaCelsius(v1));
		break;
		case 5: imprimir("Valor resultante da conversão da temperatura em Kelvin para Fahrenheit : " + kelvinParaFahrenheit(v1));
		break;
		case 6: imprimir("Valor resultante da conversão da temperatura em Fahrenheit para Kelvin : " + fahrenheitParaKelvin(v1));
		break;
		default: imprimir("Opção inválida!");
		
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
