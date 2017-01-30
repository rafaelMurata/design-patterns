package br.com.rafaelmurata.patterns.builder.boasPraticas;

import br.com.rafaelmurata.patterns.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{


	public void executa(NotaFiscal nf) {
        System.out.println("salvando no banco");
	}
}
