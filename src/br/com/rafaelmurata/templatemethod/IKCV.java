package br.com.rafaelmurata.templatemethod;

import br.com.rafaelmurata.chainsOfResponsability.Item;
import br.com.rafaelmurata.strategy.Imposto;
import br.com.rafaelmurata.strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	/*
	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor()>500 && itemMaiorQue100Reais(orcamento)){
			return orcamento.getValor() * 0.10;	
		}else{
			return orcamento.getValor() *0.06;
		}
	}
	*/

	private boolean itemMaiorQue100Reais(Orcamento orcamento) {
		for(Item item :orcamento.getItens()){
			if(item.getValor() >100 )return true;
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;

	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 100 && itemMaiorQue100Reais(orcamento);

	}

}
