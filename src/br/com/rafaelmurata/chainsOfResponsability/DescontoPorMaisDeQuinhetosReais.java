package br.com.rafaelmurata.chainsOfResponsability;

public class DescontoPorMaisDeQuinhetosReais implements Desconto{

	private Desconto proximo;
	
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.7;
		}else{
			return proximo.desconta(orcamento);			
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo=proximo;
	}
}
