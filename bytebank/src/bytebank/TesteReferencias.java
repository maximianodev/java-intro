package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("saldo segundaConta " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("saldo segundaConta " + segundaConta.saldo);

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("são as mesmas contas");
		}
	}
}
