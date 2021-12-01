import java.util.*;

public class AtividadeMassa {

	public static void main(String[] args) {
		char c = (char)('w' - (26-3));
		imprimir(c);
		c = (char)('u' + (3));
		imprimir(c);
		imprimir(cipher("abcdefghijklmnopqrstuvwxyz", 3));
		imprimir(cipherBack("defghijklmnopqrstuvwxyzabc", 3));

	}
	
	public static String obterFrase() {
		Scanner teclado = new Scanner(System.in);
		imprimir("Digite uma frase!");
		String s = teclado.nextLine();
		return s;
	}
	
	public static String cipher(String msg, int shift){
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) + shift);
	        if (msg.charAt(x) == ' ') {
	        	s += " ";
	        } else if (c > 'z') {
	        	s += (char)(msg.charAt(x) - (26-shift));
	        } else {
	        	s += (char)(msg.charAt(x) + shift);
	        }
	    }
	    return s;
	}
	
	public static String cipherBack(String msg, int shift){
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) + shift);
	        if (msg.charAt(x) == ' ') {
	        	s += " ";
	        } else if (c > 'z') {
	        	s += (char)(msg.charAt(x) + (26-shift));
	        } else {
	        	s += (char)(msg.charAt(x) - shift);
	        }
	    }
	    return s;
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
	public static void imprimir(char str) {
		System.out.println(str);
	}
	
}
