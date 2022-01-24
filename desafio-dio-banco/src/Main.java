
public class Main {
	
	public static void main(String[] args) {	
		
		Cliente antonio = new Cliente();
		antonio.setNome("Antonio");
		
		Conta cc = new ContaCorrente(antonio);
		Conta poupanca = new ContaPoupanca(antonio);
		
		cc.depositar(200);
		poupanca.depositar(200);
		cc.transferirdoc(0, poupanca);
		cc.transferirted(0, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
