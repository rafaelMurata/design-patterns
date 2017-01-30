package br.com.rafaelmurata.solid.OO_DIP;

public class Frete implements ServicoDeEntrega {

	@Override
	public double para(double cidade) {
		if(cidade == 0.0){
			return 15;
		}
		
		return 0;
	}
}
