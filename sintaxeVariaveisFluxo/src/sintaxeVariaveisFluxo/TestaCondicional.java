package sintaxeVariaveisFluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais...");

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, más pode entrar por estar acompanhado.");	
			} else {
				System.out.println("Não pode entrar, você é menor de idade.");				
			}
		}
	}
}
