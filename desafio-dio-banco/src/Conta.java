
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}


	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar() {

	}

	public void depositar() {

	}

	public void transferir() {

	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferirdoc(double valor, Conta contaDestino) {
		if(this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
		}else {
			this.sacar(valor);
			contaDestino.depositar(valor - 10);	
		}
		
	}
	
	public void transferirted(double valor, Conta contaDestino) {
		if(this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
		}else {
			this.sacar(valor);
			contaDestino.depositar(valor - 8);	
		}
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
