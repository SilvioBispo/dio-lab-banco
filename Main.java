
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Silvio");
		
		Conta cc = new ContaCorrente(Silvio);
		Conta poupanca = new ContaPoupanca(Silvio);

		cc.depositar(200);
		cc.transferir(100, poupanca);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
