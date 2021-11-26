
public class PraticaVinteCinco {

	public static void main(String[] args) {

		for(int i=1900; i<2033; i++) {
			if (i%4==0) {
				if(i%100==0) {
					if(i%400==0) {
						System.out.print(i+" ");
					}
				} else {
					System.out.print(i+" ");
				}
			}
		}
	}
}
