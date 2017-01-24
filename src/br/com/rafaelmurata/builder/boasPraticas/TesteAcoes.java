package br.com.rafaelmurata.builder.boasPraticas;

import br.com.rafaelmurata.builder.ItemDaNota;
import br.com.rafaelmurata.builder.NotaFiscal;
import br.com.rafaelmurata.builder.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorSms());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123123").comItem(new ItemDaNota("nome", 100))
				.comObservacao("bla").naDataAtual().constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
