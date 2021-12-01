package prova0202;

public class Problema01 {

	public static void main(String[] args) {
		imprimir("Sequencia 1: ");
		imprimir(sequencia1(30,6));
		imprimir("\n\nSequencia 2: ");
		imprimir(sequencia2(sequencia1(30,6)));
		imprimir("\n\nSequencia 3: ");
		imprimir(sequencia3(30));
		imprimir("\n\nMédia Ponderada: "+mediaPonderada(sequencia3(30)));
		imprimir("\nMédia Aritmética: "+mediaAritmetica(sequencia1(30,6),sequencia3(30)));
		
	}
	
	public static int[] sequencia1(int tam, int valorInicial) {
		int[] vet = new int[tam];
		int i=valorInicial, y=0, x=0;
		
		// i é o valor que recebe o valor inicial e continua contando
		// até a ultima posição do vetor.
		
		// y é o contador para passar a posição do vetor de acordo com
		// que o valor de i entra na primeira condicional.
		
		// e x é o que tem a função de parar a repetição quando perceber
		// que a ultima casa do vetor já está preenchida.
		
		while(x==0) {
			if (i%3==0 && i%2==0) {
				vet[y] = i;
				y++;
			}
			if (vet[29]>0) {
				x++;
			}
			i++;
		}
		
		return vet;
	}
	
	public static int[] sequencia2(int[] vetor) {
		int[] vet = new int[vetor.length];
		
		for(int i = vetor.length - 1, x=0; i>=0; i--, x++) {
			vet[x] = vetor[i];
		}
		
		// No início do for a variavel i recebe o tamanho do vetor diminuido de 1
		// caso fosse somente o tamanho do vetor, ele dá erro de outofbounds, pois não
		// existe casa 30.
		
		// o valor x é apenas um segundo contador para fazer a contagem do segundo vetor.
				
		return vet;
	}
	
	public static int[] sequencia3(int tam) {
		int[] vet = new int[tam];
		vet[0] = 0;
		vet[1] = 1;
		for (int i = 2; i < vet.length; i++) {
			vet[i] = vet[i-1] + vet[i-2];
		}
		return vet;
	}
	
	public static double mediaPonderada(int[] vetor) {
		
		final double p1=4,p2=6;
		double valor1=0, valor2=0, num;
		
		for(int i = 0; i < vetor.length; i++) {
			if (i==11) {
				valor1 = vetor[i];
			} else if (i==17) {
				valor2 = vetor[i];
			}
		}
		
		// A repetição consistia em pegar o 12° e o 18° valor
		// tendo em mente que a posição do vetor é sempre -1.
		
		num = (valor1*p1 + valor2*p2) / (p1+p2);
		
		return num;
	}
	
	public static double mediaAritmetica(int[] vetor1, int[] vetor2) {
		double soma1=0, soma2=0, num=0;
		
		for (int i = 0; i< vetor1.length; i++) {
			soma1 += vetor1[i];
			soma2 += vetor2[i];
		}
		
		num = (soma1+soma2)/2;
		
		return num;
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}
	
	public static void imprimir(double num) {
		System.out.println(num);
	}

}
