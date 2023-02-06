package sintaxeVariaveisFluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais...");

		int idade = 17;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println(acompanhado);
	}
}
