package questao.cinco;

public class Conta {
	
	String nConta;
	String nome = "";
	private int ativo=0;
	private float saldo=0;
	
	Conta(int val, String pessoa) {
		String str = String.format("%04d", val);
		this.nConta = str;
		this.nome = pessoa;
		this.ativo = 1;
	}
	
	public String getNumeroConta() {
		return nConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAtivo() {
		return ativo;
	}
	
	public void sacar(float valor) {
		if(valor < saldo) {
			this.saldo -= valor;
			System.out.println("-----------------------------------------------");
			System.out.println("Saque de R$ " + valor + " efetuado!");
			System.out.println("Seu saldo atual é de R$ " + saldo);
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println("Saldo insuficiente!");
			System.out.println("Seu saldo atual é de R$ " + saldo);
		}
	}
	
	public void depositar(float valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("-----------------------------------------------");
			System.out.println("Depósito de R$ " + valor + " efetuado!");
			System.out.println("Seu saldo atual é de R$ " + saldo);
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println("Quantidade para deposito inválida!");
		}
	}
	
	public void getSaldo() {
		System.out.println("Saldo: " + saldo);
	}
}
