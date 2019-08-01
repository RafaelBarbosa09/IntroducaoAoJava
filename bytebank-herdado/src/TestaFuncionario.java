
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario rafael = new Funcionario();
		
		rafael.setNome("Rafael");
		rafael.setCpf("111.111.111-11");
		rafael.setSalario(1200);
		
		System.out.println("nome: " + rafael.getNome());
		System.out.println("cpf: " + rafael.getCpf());
		System.out.println("salário: " + rafael.getSalario());
		System.out.println("bonificação: " + rafael.getBonificacao());
		System.out.println("O total do salário com a bonificação é: " + (rafael.getSalario() + rafael.getBonificacao()));
		
		//rafael.salario = 300;

	}

}
