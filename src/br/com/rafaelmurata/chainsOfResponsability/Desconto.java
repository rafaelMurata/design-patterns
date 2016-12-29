package br.com.rafaelmurata.chainsOfResponsability;

public interface Desconto {

	public double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
