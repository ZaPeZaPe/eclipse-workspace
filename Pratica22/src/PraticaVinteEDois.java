
public class PraticaVinteEDois {

	public static void main(String[] args) {

		int i=21, x=0;
		
		do {

			if(i%2!=0) {
				x++;
				System.out.print(i+" ");
			}

			i++;

		} while(x!=50);
		
		System.out.println("\n"+x);

	}

}
