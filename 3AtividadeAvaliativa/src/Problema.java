
public class Problema {

	public static void main(String[] args) {
		
		imprimir(sequencia());
		/*for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (seq[1][2] == 6) {
				seq[i][j] = j+7;
			} else if (seq[0][2] == 3){
				seq[i][j] = j+4;
			} else {
				seq[i][j] = j+1;
			}
		}
	}*/
		
		

	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	
	public static char[][] sequencia() {
		char[][] seq = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				seq[i][j] = '-';
			}
		}
		
		seq[0][1]='x';
		seq[0][2]='o';
		System.out.println("");
		return seq;
	}
	
	public static void imprimir(char[][] v) {
		for (int i = 0; i < 3; i++) {
			System.out.println("-------");
			for (int j = 0; j < 3; j++) {
				System.out.print("|" + v[i][j]);
			}
			System.out.println("|\n");
		}
		System.out.println("-------");
	}
	
}
