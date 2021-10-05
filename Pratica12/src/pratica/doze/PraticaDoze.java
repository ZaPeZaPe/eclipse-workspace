package pratica.doze;
import java.util.*;

public class PraticaDoze {

	public static void main(String[] args) {
		
		String nome, bairro, rua, cidade, estado;
		char op;
		int altura, numero=0, cep;
		float peso;
		boolean situacao = false;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("---------------------CADASTRO---------------------");
		
		System.out.println("Digite o seu nome!");
		nome = teclado.nextLine();
		System.out.println("Olá Sr(a) " + nome + "!");
		
		System.out.println("Por favor digite sua altura em centimetros!");
		altura = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Agora digite seu peso!");
		peso = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Agora informe seu endereço completo!");
		System.out.println("Começe informando o nome da rua:");
		rua = teclado.nextLine();
		
		System.out.println("Agora nos informe o número da rua (Se não tiver pode apertar enter)");
		numero = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Agora informe o bairro!");
		bairro = teclado.nextLine();
		
		System.out.println("Agora informe o CEP!");
		cep = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Agora informe a cidade!");
		cidade = teclado.nextLine();
		
		System.out.println("Agora informe o estado!");
		estado = teclado.nextLine();
		
		System.out.println("Deseja que o cadastro seja ativo?");
		System.out.println("Digite (S) para Sim e (N) para Não");
		op = teclado.next().charAt(0);
		if (op == 'S' || op == 's') {
			situacao = true;
			System.out.println("Cadastro colocado como ATIVO");
		} else {
			System.out.println("Cadastro colocado como INATIVO");
		}
		
		System.out.println("Cadastro finalizado!");
		System.out.println("Segue cadastro:");
		
		System.out.printf("------------------------CADASTRO------------------------\n");
		System.out.printf("Nome: %s\nAltura: %d\nPeso: %.2f\nEndereço: %s, n° %d, %s, %d %s - %s\n",nome,altura,peso,rua,numero,bairro,cep,cidade,estado);
		if (situacao) {
			System.out.println("Situação do cadastro: ATIVO");
		} else {
			System.out.println("Situação do cadastro: INATIVO");
		}		
	}
}
