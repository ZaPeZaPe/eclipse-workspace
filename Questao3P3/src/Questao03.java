
public class Questao03 {

	public static void main(String[] args) {

		int i=0, j=1, x=0;
		
		do {
			
			System.out.print(i+" "+j+" ");
			i = i+j;
			j = i+j;
			
			x++;
			
		} while(x!=15);

	}

}
