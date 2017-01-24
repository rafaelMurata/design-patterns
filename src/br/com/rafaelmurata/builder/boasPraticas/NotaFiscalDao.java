package br.com.rafaelmurata.builder.boasPraticas;

import br.com.rafaelmurata.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{


	public void executa(NotaFiscal nf) {
        System.out.println("salvando no banco");
	}
}
