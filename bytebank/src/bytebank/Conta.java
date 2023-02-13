package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double value) {
		this.saldo += value;
	}

	public boolean saca(double value) {
		if (this.saldo >= value) {
			this.saldo -= value;
			
			return true;
		} else {
			return false;
		}
	}
}
