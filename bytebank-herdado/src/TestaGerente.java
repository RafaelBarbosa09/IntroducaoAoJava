
public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Rafael");
		g1.setCpf("111.111.111-11");
		g1.setSalario(5000);

		System.out.println("nome: " + g1.getNome());
		System.out.println("cpf: " + g1.getCpf());
		System.out.println("salário: " + g1.getSalario());
		System.out.println("bonificação: " + g1.getBonificacao());

		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);

		System.out.println(autenticou);

		System.out.println(g1.getBonificacao());

	}

}
