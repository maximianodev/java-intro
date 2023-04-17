package bytebankComposto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		
		lucas.nome = "Lucas Maximiano";
		lucas.cpf = "222.222.222-22";
		lucas.profissao = "Developer";

		Conta contaDoLucas = new Conta();
		
		contaDoLucas.deposita(100);
		contaDoLucas.titular = lucas;
		

		System.out.println("Conta: " + contaDoLucas.titular.nome);
		System.out.println("Saldo: " + contaDoLucas.getSaldo());
	}
}
