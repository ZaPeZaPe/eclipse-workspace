package lololo;

import java.util.Scanner;

public class Extra02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] ve = frases();
		System.out.println("Usuário, qual a sua idade?");
		int idade = sc.nextInt();
		if (idade >= 20 && idade <= 30) {
			System.out.println(ve[0]);
		} else if (idade >= 31 && idade <= 40) {
			System.out.println(ve[1]);
		} else if (idade >= 41 && idade <= 50) {
			System.out.println(ve[2]);
		} else {
			System.out.println(ve[3]);
		}

	}
	
	public static String[] frases() {
		String[] frase = new String[4];
		frase[0] = "Meu amor não será passageiro, te amarei de Janeiro a Janeiro, até o mundo acabar";
		frase[1] = "Ainda bem que voê vive comigo, porque senão, como seria esta vida?";
		frase[2] = "Das coisas que são para sempre, você é uma delas";
		frase[3] = "O verdadeiro amor nunca se desgasta. Quanto mais se dá, mais se tem";
		return frase;
	}

}
