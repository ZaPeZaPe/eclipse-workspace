package questao.cinco;

import java.util.Scanner;

public class QuestaoCinco {

	public static void main(String[] args) {
		int qntContas=0, dec=0, j=1, cnt, cnt2, validar=0, i, atv;
		float qnt;
		String cntv = "", nomenovo="";
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Conta[] contas = new Conta[9998];
		
		
		
		while(j!=0) {
			System.out.println("Digite qual a operação que deseja realizar!");
			System.out.println("(Por exemplo, digite 1 para criar uma conta!)");
			System.out.printf("1 - Criar Conta\n2 - Sacar Dinheiro\n3 - Depositar Dinheiro\n4 - Sair\n");
		switch(teclado.nextInt()) {
			case 1: {
				if (validar==0) {
					System.out.println("Digite o nome do titular da nova conta!");
					validar=1;
					nomenovo = teclado2.nextLine();
					contas[qntContas] = new Conta(qntContas+1, nomenovo);
					System.out.println("Conta criada com sucesso!");
					System.out.println("-----------------------------------------------");
					break;
				} else {
					qntContas++;
					System.out.println("Digite o nome do titular da nova conta!");
					nomenovo = teclado2.nextLine();
					contas[qntContas] = new Conta(qntContas+1, nomenovo);
					System.out.println("Conta criada com sucesso!");
					System.out.println("-----------------------------------------------");
					break;
				}
			}
			case 2: {
					System.out.println("Digite o número da conta para realizar o saque!");
					cntv = teclado2.nextLine();
					cnt = Integer.parseInt(cntv);
					cnt2 = cnt - 1;
					System.out.println(cnt2);
					atv = 0;
					contas[0].getAtivo();
					if (qntContas>9999) {
						System.out.println("Limite de criação de contas excedido!");
						System.out.println("-----------------------------------------------");
						break;
					} else if (atv==0) {
						System.out.println("Crie uma conta e em seguida realize um depósito para poder efetuar o saque!");
						System.out.println("Digite o nome do titular da nova conta!");
						validar=1;
						nomenovo = teclado2.nextLine();
						contas[qntContas] = new Conta(qntContas+1, nomenovo);
						System.out.println("Conta criada com sucesso!");
						System.out.println("-----------------------------------------------");
						break;
					} else {
						System.out.println("Digite a quantia para realizar o saque!");
						qnt = teclado.nextFloat();
						contas[cnt-1].sacar(qnt);
						System.out.println("-----------------------------------------------");
						break;
					}
			}
			case 3: {
				System.out.println("Digite o número da conta para realizar o depósito!");
				cntv = teclado2.nextLine();
				cnt = Integer.parseInt(cntv);
				System.out.println(cnt);
				atv = contas[cnt].getAtivo();
				if (qntContas==9999) {
					System.out.println("Limite de criação de contas excedido!");
					System.out.println("-----------------------------------------------");
					break;
				} else if (atv==0) {
					System.out.println("Crie uma conta para poder efetuar o depósito!");
					System.out.println("Digite o nome do titular da nova conta!");
					validar=1;
					nomenovo = teclado2.nextLine();
					contas[qntContas] = new Conta(qntContas+1, nomenovo);
					System.out.println("Conta criada com sucesso!");
					System.out.println("-----------------------------------------------");
					System.out.println("Digite a quantia para realizar o depósito!");
					qnt = teclado.nextFloat();
					contas[cnt-1].depositar(qnt);
					System.out.println("-----------------------------------------------");
					break;
				} else {
					System.out.println("Digite a quantia para realizar o depósito!");
					qnt = teclado.nextFloat();
					contas[cnt-1].depositar(qnt);
					System.out.println("-----------------------------------------------");
					break;
				}
			}
		case 4: {
			System.out.println("Operações finalizadas!");
			System.out.println("-----------------------------------------------");
			j=0;
			break;
		}
		default: System.out.println("Opção inválida!");
				 System.out.println("-----------------------------------------------");
		}
		}
	}
	
	
}
