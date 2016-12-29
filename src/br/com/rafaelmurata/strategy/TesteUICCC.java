package br.com.rafaelmurata.strategy;

public class TesteUICCC {

	public static void main(String[] args) {
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calcula = new CalculadorDeImpostos();
		calcula.realizaCalculo(orcamento, iccc);
	}

}
