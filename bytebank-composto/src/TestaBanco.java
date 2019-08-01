
public class TestaBanco {
	public static void main(String[] args) {
		
		Conta contaDoRafael = new Conta();
		
		Cliente rafael = new Cliente();
		rafael.nome = "Rafael Barbosa";
		rafael.cpf = "123.456.789-00";
		rafael.profissao = "Desenvolvedor mobile";
		
		contaDoRafael.deposita(5700);
		
		contaDoRafael.titular = rafael;
		
		System.out.println(contaDoRafael.titular.profissao);
		
	}

}
