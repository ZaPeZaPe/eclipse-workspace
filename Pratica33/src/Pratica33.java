
public class Pratica33 {

	public static void main(String[] args) {
		imprimir(sequencia());
	}
	
	public static int[] sequencia() {
		int[] seq = new int[30];
		seq[0] = 0;
		seq[1] = 1;
		for (int i = 2; i < seq.length; i++) {
			seq[i]= seq[i-1] + seq[i-2];
		}
		return seq;
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}
	
}
