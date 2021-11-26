
public class Questao6P3 {

	public static void main(String[] args) {
		int y=0, i=0, valor=0, soma=0;
		
		while(y!=1) {
			
			valor = 19 + (((i+1)-1)*4);
			
			if (valor < 500) {
				soma += valor;
				i++;
			} else {
				y++;
			}
		}
		
		System.out.println(soma);
	}

}
