
public class Main {

	public static void main(String[] args) {
		Cliente ronaldo = new Cliente();
		ronaldo.setNome("Ronaldo");
		
		Conta cc = new ContaCorrente(ronaldo);
		Conta poupanca = new ContaPoupanca(ronaldo);

		cc.depositar(100);
		cc.sacar(25);
		cc.transferir(75, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
