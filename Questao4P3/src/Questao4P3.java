
public class Questao4P3 {

	public static void main(String[] args) {
		
		int valor = 24, PG = 3;
        while(valor<=100000){
            System.out.println(valor);
            valor = valor*PG;
        }
        
		/*int y=0, i=0, x=0, valor=0, elevado=0, soma=0, potencia=0, repeticao=1;
		
		while(y!=1) {
			
			
			elevado = 1;
			
			while (x!=elevado) {
				repeticao = elevado;
				while (repeticao!=0) {
					soma += (3+3+3)*repeticao;
					repeticao=0;
				}
				x++;
			}
			
			System.out.println(soma);
			x=0;
			y++;*/
			/*if (elevado==0) {
				valor = 24 * 1;
			} else {
				valor = 24 * 3^(i-1);
			}
			
			//3+3+3 = 3*3
			//3^4 = ((3+3+3 + 3+3+3 + 3+3+3) + (3+3+3 + 3+3+3 + 3+3+3)) + ((3+3+3 + 3+3+3 + 3+3+3) + (3+3+3 + 3+3+3 + 3+3+3)) + ((3+3+3 + 3+3+3 + 3+3+3) + (3+3+3 + 3+3+3 + 3+3+3))
			
			
			
			if (valor < 100000) {
				System.out.print(valor+" ");
				i++;
			} else {
				y++;
			}
		}*/

	}

}
