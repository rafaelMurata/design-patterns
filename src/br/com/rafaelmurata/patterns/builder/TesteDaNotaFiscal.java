package br.com.rafaelmurata.patterns.builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
	/*
		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("Item 1", 200.0),new ItemDaNota("Item 2", 400.0));
		
		double valorTotal =0;
		for (ItemDaNota itemDaNota : itens) {
			valorTotal+= itemDaNota.getValor();
			
		}
		double impostos = valorTotal * 0.05;
		
		NotaFiscal nf = new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "");
	 */
		NotaFiscalBuilder builder = new NotaFiscalBuilder()
		.paraEmpresa("Caelum Ensino e inovação")
		.comCnpj("12.067/001-12")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comItem(new ItemDaNota("Item 3", 400.0))
		.comObservacao("observacao")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
