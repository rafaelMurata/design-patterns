package br.com.rafaelmurata.solid.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("Envia email da nota");		
	}

}
