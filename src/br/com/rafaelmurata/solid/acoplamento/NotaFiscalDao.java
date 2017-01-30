package br.com.rafaelmurata.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("salva no banco");
	}

	
}
