package teste;

public class conta {
	public String nConta;
	public String nome;
	private float saldo=0;

	conta(int val, String pessoa) {
		String str = String.format("%04d", val);
		this.nConta = str;
		this.nome = pessoa;
	}
	
	public String depositar(float valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito de R$ " + valor + " efetuado!");
		} else {
			System.out.println("Quantidade para deposito inv�lida!");
		}
		return "Seu saldo atual � de R$ " + saldo;
	}
	
	public void getSaldo() {
		System.out.println("Saldo: " + saldo);
	}
}
