package br.com.rafaelmurata.builder.boasPraticas;

import br.com.rafaelmurata.builder.NotaFiscal;

public class EnviadorSms implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
        System.out.println("enviando por sms");
		
	}
}
