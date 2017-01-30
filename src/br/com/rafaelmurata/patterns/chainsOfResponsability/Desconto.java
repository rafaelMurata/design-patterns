package br.com.rafaelmurata.patterns.chainsOfResponsability;

public interface Desconto {

	public double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
