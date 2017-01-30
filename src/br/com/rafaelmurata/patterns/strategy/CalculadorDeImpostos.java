package br.com.rafaelmurata.patterns.strategy;

public class CalculadorDeImpostos {

	/*
	* Cen�rio
	 public void realizaCalculo(Orcamento orcamento,Imposto imposto){
			double icms = imposto.calcula(orcamento);
			System.out.println(icms);
	}
	 */
	public void realizaCalculo(Orcamento orcamento,Imposto imposto){
			double icms = imposto.calcula(orcamento);
			System.out.println(icms);
	}

}
