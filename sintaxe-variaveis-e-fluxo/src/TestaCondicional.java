
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 12;
		int quantidadePessoas = 1;
		
		if (idade >= 18) { 
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else if (quantidadePessoas >=2){
			System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado.");
		} else {
			System.out.println("Sinto muito, mas você não pode entrar...");
		}
	}
}
