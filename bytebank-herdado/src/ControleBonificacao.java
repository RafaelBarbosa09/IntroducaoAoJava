
public class ControleBonificacao {
	
	private double soma;
	
	//crio um método genérico para bonificação e ao fazer diferentes cálculos para bonificação em outras classes, 
	//o polimorfismo permite que não seja necessário repetir esse método o tempo inteiro.
	public void registra(Funcionario g) { 
		double boni = g.getBonificacao();
		this.soma += boni;
		
	}
	
	public double getSoma() {
		return soma;
	}

}
