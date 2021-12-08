import java.util.*;
public class Pratica35 {

	public static void main(String[] args) {
		String[] dia1 = dataNiver();
		String[] dia2 = dataHoje();
		
		imprimir("\nDias aproximadamente vivídos: "+dias(dia1,dia2));
	}
	
	public static String[] dataNiver() {
		Scanner teclado = new Scanner(System.in);
		imprimir("Digite a data de seu nascimento (DD/MM/AAAA):");
		String antes = teclado.nextLine();
		String[] niver = antes.split("/");
		return niver;
	}
	
	public static String[] dataHoje() {
		Scanner teclado = new Scanner(System.in);
		imprimir("Digite a data de hoje (DD/MM/AAAA):");
		String today = teclado.nextLine();
		String[] hoje = today.split("/");
		return hoje;
	}
	
	public static int dias(String[] data1, String[] data2) {
		int dias=0, ano = Integer.parseInt(data1[2]), anof = Integer.parseInt(data2[2]), mes = Integer.parseInt(data1[1]), mesf = Integer.parseInt(data2[1]);
		
		for(int i=ano; i<anof; i++) {
			if (i%4==0) {
				if(i%100==0) {
					if(i%400==0) {
						dias+=366;
					} else {
						dias+=365;
					}
				} else {
					dias+=366;
				}
			} else {
				dias+=365;
			}
		}
		
		if (mes > mesf) {
			dias+=((mes-mesf)*30.417)-1;
		} else if (mes < mesf) {
			dias+=((mesf-mes)*30.417)-1;
		} else {
			dias--;
		}
		
		
		return dias;
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
	
	public static void imprimir(int n) {
		System.out.println(n);
	}

}
