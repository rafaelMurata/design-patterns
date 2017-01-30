package br.com.rafaelmurata.patterns.templateMethod;

import br.com.rafaelmurata.patterns.strategy.Imposto;
import br.com.rafaelmurata.patterns.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento) ;

}
