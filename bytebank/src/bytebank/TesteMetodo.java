package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		Conta conta	= new Conta();
		
		conta.deposita(200);
		System.out.println("deposita " + conta.saldo);

		boolean conseguiuSacar = conta.saca(50);
		System.out.println("conseguiuSacar " + conseguiuSacar);
		System.out.println("saca " + conta.saldo);
	}
}
