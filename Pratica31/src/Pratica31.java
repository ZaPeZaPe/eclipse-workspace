public class Pratica31 {

	public static void main(String[] args) {
		imprimir(sequencia01());
	}

	public static int[] sequencia01() {
		int[] seq = new int[15];
		for (int i = 0, num = 2; i < seq.length; i++) {
			if(num%2==0) {
				seq[i] = num;
			} else {
				num++;
				seq[i] = num;
			}
			num++;
			
		}
		return seq;
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

}
