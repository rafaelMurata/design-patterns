package br.com.rafaelmurata.chainsOfResponsability;

public class CalculadoraDeDescontos {

	/*
	public double calcula(Orcamento orcamento){
		//mais de 5 desconto
		if(orcamento.getItems().size()>5){
			return orcamento.getValor() *0.1;
		}
		else if(orcamento.getValor()>500.0){
			return orcamento.getValor() *0.7;
		}
		return 0;
		
	}
	 entao 
	public double calcula(Orcamento orcamento){
		double desconto = new DescontoPorCincoItems().desconto(orcamento);
		if(desconto == 0) desconto = new DescontoPorMaisDeQuinhetosReais().desconto(orcamento);
		
		return 0;
	}
	*/
	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoPorCincoItems();
		Desconto d2 = new DescontoPorMaisDeQuinhetosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		return d1.desconta(orcamento);
	}	
}
