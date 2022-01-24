
public interface IConta {
	
	void sacar (double valor);
	
	void depositar (double valor);
	
	void transferirdoc (double valor, Conta contaDestino);
	
	void transferirted (double valor, Conta contaDestino);
	
	void imprimirExtrato();

}
