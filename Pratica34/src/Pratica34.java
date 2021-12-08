import java.util.*;

public class Pratica34 {

	public static void main(String[] args) {
		
		String[] alunos = obterNomes(6);
		String aluno = "Jorge";
		
		imprimir(obterNomePeloIndice(3,alunos));
		imprimir("\nO aluno " +aluno+" está na "+obterIndicePeloNome(aluno,alunos)+"° posição da lista!");
		

	}
	
	public static String[] obterNomes(int tam) {
		String[] lista = new String[tam];
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i < lista.length; i++) {
			imprimir("Digite o nome do "+(i+1)+"° aluno");
			lista[i] = teclado.nextLine();
		}
		return lista;
	}
	
	public static String obterNomePeloIndice(int indice, String[] nomes) {
		return "\nExibindo o "+indice+"° aluno da lista: "+nomes[indice-1]+"!";
	}
	
	public static int obterIndicePeloNome(String nome, String[] vet) {
		for(int i=0; i < vet.length; i++) {
			if(nome.equals(vet[i])) {
				return i+1;
			}
		}
		return 404;
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
	
	public static void imprimir(int n) {
		System.out.println(n);
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
		}
	}
	

}
