package br.com.rafaelmurata.builder.boasPraticas;

import br.com.rafaelmurata.builder.NotaFiscal;

public class EnviadorEmail implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf) {
        System.out.println("enviando por e-mail");
		
	}

}
