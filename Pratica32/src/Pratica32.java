
public class Pratica32 {

	public static void main(String[] args) {
		imprimir(sequencia());
	}
	
	public static int[] sequencia() {
		int[] seq = new int[30];
		int i=0;
		while(i!=30) {
			seq[i] = i+1;
			i++;
		}
		return seq;
	}
	
	public static void imprimir(int[] v) {
		int i=0;
		while (i!=30) {
			System.out.print(v[i] + " ");
			i++;
		}
	}
	
}
