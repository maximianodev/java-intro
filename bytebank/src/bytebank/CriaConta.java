package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 10000;		
		
		System.out.println("Primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Segunda conta " + segundaConta.saldo);
	}
}