package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();

		contaDoPaulo.deposita(200);
		System.out.println("conta Paulo " + contaDoPaulo.saldo);

		boolean conseguiuSacar = contaDoPaulo.saca(50);

		if (conseguiuSacar) {
			System.out.println("Paulo sacou 50 ");
		}

		System.out.println("conta Paulo " + contaDoPaulo.saldo);

		Conta contaMarcela = new Conta();
		
		contaMarcela.deposita(1000);
		System.out.println("conta Marcela " + contaMarcela.saldo);

		boolean transferenciaMarcela = contaMarcela.transfere(300, contaDoPaulo);

		if (transferenciaMarcela) {
			System.out.println("Marcela transferiou 300 ");
		}

		System.out.println("conta Marcela " + contaMarcela.saldo);
		
		
		contaDoPaulo.titular = "Paulo";
		System.out.println(contaDoPaulo.titular);
	}
}
