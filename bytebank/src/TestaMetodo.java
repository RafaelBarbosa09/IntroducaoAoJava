
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRafael = new Conta();
		contaDoRafael.saldo = 1700;
		contaDoRafael.deposita(100);
		System.out.println(contaDoRafael.saldo);
		
		contaDoRafael.saca(350);
		System.out.println(contaDoRafael.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoRafael)) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente...");
		}
		
		System.out.println("O saldo da Marcela é: " + contaDaMarcela.saldo);
		System.out.println("O saldo do Rafael é: " + contaDoRafael.saldo);
	}
}
