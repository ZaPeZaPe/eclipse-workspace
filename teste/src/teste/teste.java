package teste;

import java.util.*;

public class teste {

	public static void main(String[] args) {
		
		String nomenovo;
		conta[] contas = new conta[9998];
		
		contas[0] = new conta(1,"Isaac");
		contas[1] = new conta(2,"Jorge");
		
		System.out.println("Digite o nome do titular da nova conta!");
		Scanner teclado = new Scanner(System.in);
		nomenovo = teclado.nextLine();
		contas[2] = new conta(3, nomenovo);
		
		System.out.println(contas[0].nome + " - " + contas[0].nConta);
		System.out.println(contas[1].nome + " - " + contas[1].nConta);
		System.out.println(contas[2].nome + " - " + contas[2].nConta);
		
		contas[0].depositar(1000);
		contas[0].getSaldo();
		contas[1].depositar(1000);
		contas[1].getSaldo();
		contas[2].depositar(1000);
		contas[2].getSaldo();
	}

}
