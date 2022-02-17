import java.util.*;

public class SolucaoDesafio {
	
	static String linha = "-----------------------------------------------------------------------------";

	public static void main(String[] args) {
		despesas();
	}

	public static void despesas() {
		String[][] listaDespesa, listaPessoas;
		double resultado=0;
		int qtd=0, x=0;
		
		imprimir(linha+"\n\n");
		imprimir("Digite a quantidade de pessoas existentes para dividir a despesa total: ");
		qtd = obterNum(); // Recebe a quantidade de pessoas para dividir a soma das despesas
		
		imprimir("\n"+linha+"\n");
		listaPessoas = listaDePessoas(qtd); // Monta a lista de pessoas e salva a lista
		
		imprimir("\n"+linha+"\n");
		imprimir("\nDigite a quantidade de despesas existentes: ");
		qtd = obterNum(); // Recebe a quantidade de despesas para inicializar uma lista
		
		imprimir("\n"+linha+"\n");
		listaDespesa = listaDeDespesas(qtd); // Monta a lista de despesas e salva a lista

		resultado = calcularDespesas(listaDespesa); // Calcula o resultado a partir da lista passada por parâmetro e salva o resultado

		listaPessoas = listaDeDevedores(listaPessoas, resultado); // Divide o valor entre as pessoas da lista;

		while(x!=1) {
			imprimir(linha+"\n");
			imprimir("\n[1] Atualizar a lista de devedores\n[2] Sair do programa\n");
			x = obterNum(); // Recebe a resposta do usuário
			switch(x) {
			case 1: listaPessoas = atualizarPessoas(listaPessoas); // Atualiza a lista de pessoas
			x=0; break; // Define x como 0 para rodar o menu novamente
			case 2: x=1; break; // Define x como 1 para finalizar o programa e sair do laço de repetição
			default: imprimir("Opção inválida!\n"); x=0;
			}
		}
	}

	public static String[][] listaDePessoas (int val){
		String[][] nomes = new String[val][3];
		String nome="";
		int x=0, y=0;

		for (int i=0; i < nomes.length ; i++) {

			while(x!=1) {

				imprimir("\nDigite o nome da "+(i+1)+"° pessoa: ");
				nome = obterString();

				for (int j=0; j < nomes.length; j++) {
					if(nome.equals(nomes[j][0])) {
						y=1; // Verifica se existem nomes duplicados
					}
				}
				
				if (y==0) {
					nomes[i][0]=nome; // Se não houverem duplicados o nome é guardado
					x=1; // X vira 1 para sair do laço de repetição
				} else {
					imprimir("\nNão podem haver nomes repetidos ou nulos!\n");
				} y=0; // Y vira 0 para futuramente ser usado como se fosse utilizado pela primeira vez

			} x=0; // Como está em um laço de repetição ele vai ser usado futuramente e tem o mesmo destino do Y

			nomes[i][1] = "0";// Recebe o valor que a pessoa deve pegar
			nomes[i][2] = "Não Pagou";// Recebe o estado de pagamento
		}
		return nomes;
	}

	public static String[][] listaDeDespesas (int val){
		String[][] list = new String[val][3];

		// Resolvi organizar a lista de despesas em uma matriz bidimensional da seguinte maneira:
		// Cada despesa é separada por uma linha
		// Cada despesa tem seus campos de nome, quantidade e valor separados por colunas
		// i = linhas
		// j = colunas

		for (int i=0; i < val; i++) {
			for (int j=0; j < 3; j++) {
				switch(j) {
				case 0: imprimir("\nDigite o nome da "+(i+1)+"° despesa (Ex: Restaurante): ");
				list[i][j] = obterString(); break; // Recebe o nome da despesa
				case 1: imprimir("\nDigite a quantidade (Ex: 2,50): ");
				list[i][j] = Double.toString(obterDouble()); break; // Recebe a quantidade
				case 2: imprimir("\nDigite o valor unitário da despesa (Ex: R$ 5.00): R$ ");
				list[i][j] = Double.toString(obterDouble()); imprimir("\n"+linha+"\n"); break; // Recebe o valor unitario da despesa
				default: imprimir("Isaac Luís Silva Santos"); // Ele nunca vai chegar aqui
				}
			}
		}
		return list;
	}

	public static double calcularDespesas (String[][] lista) {
		double n1=0, n2=0, resultado=0;

		for (int i=0; i < lista.length; i++) {
			for (int j=1; j < lista[i].length; j++) {
				switch(j) {
				case 1: n1 = Double.parseDouble(lista[i][j]); break; // Recebe a quantidade
				case 2: n2 = Double.parseDouble(lista[i][j]); // Recebe o valor unitário
				resultado+= n1*n2; break; 
				// multiplica os dois e envia o resultado para a variavel resultado que vai 
				// sempre somando até acabar a lista de despesas
				default: imprimir("Isaac Luís Silva Santos"); // Ele nunca vai chegar aqui
				}
			}
		}
		return resultado;
	}

	public static String[][] listaDeDevedores (String[][] lista, double res){
		double deve=0;

		deve = res/lista.length; // Divide o resultado pela quantidade de pessoas

		for (int i=0; i < lista.length ; i++) {
			lista[i][1] = String.format("%.2f", deve);// Recebe o valor que a pessoa deve pegar
		}

		return lista;
	}

	public static String[][] atualizarPessoas (String[][] lista){
		String nome;
		int x=0, y=0, opcao;
		imprimir(linha+"\n");
		for (int i=0; i < lista.length; i++) {
			if ("Não Pagou".equals(lista[i][2])) {
				imprimir("\nNome: " + lista[i][0]
						+ "\nDeve: R$ " + lista[i][1]
						+ "\nSituação: " + lista[i][2] + "\n");
			}
		}
		imprimir("\n"+linha);
		
		// Imprime a lista com os nomes de quem tem a situação "Não Pagou"

		imprimir("\n\nDigite o nome de quem você deseja retirar da lista: ");
		nome = obterString();

		for (int i=0; i < lista.length ; i++) {
			if(nome.equals(lista[i][0])) {
				x=1; // Serve para informar caso não haja alguém com o nome que o usuário digitou
				if("Não Pagou".equals(lista[i][2])) {
					imprimir(linha+"\n");
					imprimir("\nNome: " + lista[i][0]
							+ "\nDeve: R$ " + lista[i][1]
							+ "\nSituação: " + lista[i][2]);
					imprimir("\n\n"+linha+"\n\n");
					// Verifica se a pessoa tem a situação "Não Pagou"
					

					while(y!=1) {
						
						imprimir("Tem certeza que deseja retirar "+nome+" da lista? \n[1] Sim \n[2] Não\n");
						opcao = obterNum();
						// Confirmação do usuário
						switch(opcao) {
							case 1: imprimir("\n"+nome+" foi removido(a) da lista!");
									imprimir("\nRetornando ao menu inicial...\n\n");
									lista[i][2] = "Pago"; y=1; break;
							case 2: imprimir("Retornando ao menu inicial...\n\n"); y=1; break;
							default: imprimir("Opção indisponível!\n\n");
						}
						
					}
				} else {
					imprimir("\nEssa pessoa já foi removida da lista!\n\n");
				}	
			}
		}

		if (x==0) {
			imprimir("\nPessoa não encontrada na lista! (Verifique se digitou o nome corretamente)\n\n");
		}

		return lista;
	}

	public static String obterString() {
		Scanner teclado = new Scanner(System.in);
		String dado = teclado.nextLine().toUpperCase();
		if (dado.isBlank() || dado.isEmpty()) {
			imprimir("\nNão são permitidos caracteres nulos!\n\nDigite novamente: ");
			return obterString();
		}
		
		// Recebe uma string que o usuário digitou e transforma os caracteres em maiúsculo
		// para evitar erros de comparação futuramente,
		// e verifica se a string é nula ou vazia.
		
		return dado; 
		// Retorna a string digitada
		// Obs: Não coloquei um try catch em string, pois ele pode querer digitar nomes com números
		// como 'Cinema 3' ou 'Pessoa 1'
	}
	
	public static int obterNum() {
		Scanner teclado = new Scanner(System.in);
		int dado=0;
		try {
            dado = teclado.nextInt();
        } catch (InputMismatchException e) { // Um try catch para barrar caracteres indesejados
            System.out.println("\nDigite apenas números inteiros, qualquer outro caractere será barrado!\nDigite a quantidade novamente: ");
            return obterNum();
        }		
		return dado; //Retorna o número digitado
	}
	
	public static double obterDouble() {
		Scanner teclado = new Scanner(System.in);
		double dado=0;
		String transform;
		transform = teclado.nextLine();
		try {
            dado = Double.parseDouble(transform.replaceAll(",","."));
        } catch (NumberFormatException e) { // Um try catch para barrar caracteres indesejados
            System.out.println("\nDigite apenas números!\nQualquer caractere nulo ou não permitido será barrado (Exceção do '.' ou ',').\nDigite o valor novamente: ");
            return obterDouble();
        }		
		return dado; //Retorna o número digitado
	}

	public static void imprimir (String str) {
		System.out.printf(str); //Imprime uma string
	}



}
