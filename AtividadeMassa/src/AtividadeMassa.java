import java.util.*;

public class AtividadeMassa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		imprimir("Deseja encriptar ou decriptar uma frase? (escolha o número)"
				+ "\n1) Encriptar"
				+ "\n2) Decriptar");
		
		x = teclado.nextInt();
		
		switch(x) {
			case 1:imprimir(cipher(obterFrase()));break;
			case 2:imprimir(cipherBack(obterFrase()));break;
			default:imprimir("Opção inválida, certifique-se que escolherá a\nopção correta na próxima vez!");
		}
	}
	
	public static String obterFrase() {
		Scanner teclado = new Scanner(System.in);
		imprimir("Digite uma frase!");
		String s = teclado.nextLine();
		return s;
	}
	
	public static String cipher(String msg){
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x)+3);
	        if (msg.charAt(x) == ' ' || (msg.charAt(x) >= 'a' && msg.charAt(x) <= 'z') || (msg.charAt(x) >= 'A' && msg.charAt(x) <= 'Z')) {
	        	if (msg.charAt(x) == ' ') {
		        	s += " ";
		        } else if (msg.charAt(x) >= 'X' && msg.charAt(x) <= 'Z') {
		        	s += (char)(msg.charAt(x) - (23));
		        } else if (c > 'z') {
		        	s += (char)(msg.charAt(x) - (23));
		        } else {
		        	s += (char)(msg.charAt(x) + 3);
		        }
	        } else {
	        	x = len;
	        	s = "Caracteres inválidos! Por favor insira apenas frases ou letras.";
	        }
	    }
	    return s;
	}
	
	public static String cipherBack(String msg){
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x)-3);
	        if (msg.charAt(x) == ' ' || (msg.charAt(x) >= 'a' && msg.charAt(x) <= 'z') || (msg.charAt(x) >= 'A' && msg.charAt(x) <= 'Z')) {
	        	if (msg.charAt(x) == ' ') {
		        	s += " ";
		        } else if (msg.charAt(x) >= 'A' && msg.charAt(x) <= 'Z') {
		        	if (msg.charAt(x) >= 'A' && msg.charAt(x) <= 'C') {
		        		s += (char)(msg.charAt(x) + 23);
		        	} else {
		        		s += (char)(msg.charAt(x) - 3);
		        	}
		        } else if (c > 'z') {
		        	s += (char)(msg.charAt(x) + 23);
		        } else if (msg.charAt(x) < 'd') {
		        	s += (char)(msg.charAt(x) + 23);
		        } else {
		        	s += (char)(msg.charAt(x) - 3);
		        }
	        } else {
	        	x = len;
	        	s = "Caracteres inválidos! Por favor insira apenas frases ou letras.";
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
	public static void imprimir(int str) {
		System.out.println(str);
	}
	
}
