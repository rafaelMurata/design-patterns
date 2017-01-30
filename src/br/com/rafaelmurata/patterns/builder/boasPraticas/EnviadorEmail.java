package br.com.rafaelmurata.patterns.builder.boasPraticas;

import br.com.rafaelmurata.patterns.builder.NotaFiscal;

public class EnviadorEmail implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf) {
        System.out.println("enviando por e-mail");
		
	}

}
