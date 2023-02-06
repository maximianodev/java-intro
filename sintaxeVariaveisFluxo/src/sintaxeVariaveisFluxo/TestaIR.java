package sintaxeVariaveisFluxo;

public class TestaIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		double taxPercent;
		

		if (salario <= 2800.0) {
			taxPercent = 7.5;
		} else if (salario <= 3751.0) {
			taxPercent = 15;
		} else {
			taxPercent = 22.5;
		}
		
		double taxValue = salario * (taxPercent / 100);
		
		System.out.println("IR é de " + taxPercent + "% e pode deduzir R$" + taxValue);
	}
}
