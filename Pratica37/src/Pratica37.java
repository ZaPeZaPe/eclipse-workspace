
public class Pratica37 {

	public static void main(String[] args) {
		imprimir(fibonacci());

	}
	
	public static String[][] fibonacci() {
		String[][] vet = new String[5][8];
		int[][] vet2 = new int[5][8];
		
		vet2[0][0] = 0;
		vet2[0][1] = 1;
		
		for (int i=0; i < vet.length; i++ ) {
			for (int j=0; j < vet[i].length; j++) {
				if (i==0 && j<2) {
					vet[i][j] = String.format("%09d",vet2[i][j]);
				} else if (i>0&&j==0) {
					vet2[i][j] = vet2[i-1][vet2[i].length-1] + vet2[i-1][vet2[i].length-2];
					vet[i][j] = String.format("%09d",vet2[i][j]);
				} else if (j==1){
					vet2[i][j] = vet2[i][j-1] + vet2[i-1][vet2[i].length-1];
					vet[i][j] = String.format("%09d",vet2[i][j]);
				} else {
					vet2[i][j] = vet2[i][j-1] + vet2[i][j-2];
					vet[i][j] = String.format("%09d",vet2[i][j]);
				}
			}
		}		
		return vet;
	}
	
	public static void imprimir(String[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.print("|" + v[i][j]);
			}
			System.out.println("|\n");
		}
	}

}
