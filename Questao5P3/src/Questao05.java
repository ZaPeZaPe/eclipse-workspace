
public class Questao05 {

	public static void main(String[] args) {
		
		int i=200, x=0;
		
		do {
			
			if(i>=100) {
				if(i%3==0 && i%2==0) {
					System.out.print(i+" ");
				}
			} else {
				x++;
			}

			i--;

		} while(x!=1);

	}

}
