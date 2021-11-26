
public class PraticaVinteETres {

	public static void main(String[] args) {
		
		int i=99, x=0;
		
		do {

			if(i%3==0 && i%2!=0) {
				x++;
				System.out.print(i+" ");
			}

			i--;

		} while(x!=15);
	}

}
