public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando o método de bonificação do editor de vídeo");
		return super.getBonificacao() + 100;
	}

}
