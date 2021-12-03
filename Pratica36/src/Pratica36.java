import java.util.Random;
import java.util.Scanner;

public class Pratica36 {

	public static void main(String[] args) {
		imprimir(arrayBid(3,5));

	}
	
	public static int[][] arrayBid (int index1, int index2) {
		
		int[][] vet = new int[index1][index2];
		for (int i=0, var=8; i < vet.length; i++ ) {
			for (int j=0; j < vet[i].length; j++, var+=2) {
				vet[i][j] = var;
			}
		}
		return vet;
		
	}
	
	public static void imprimir(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.print("|" + v[i][j]);
			}
			System.out.println("|\n");
		}
	}
	
	

}
