package sintaxeVariaveisFluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais...");

		int idade = 17;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Não pode entrar, você é menor de idade.");
		}
	}
}
