package br.com.rafaelmurata.strategy;

public class TesteDeImpostos {

	public static void main(String[] args) {
			Imposto iss = new ISS();
			Imposto icms = new ICMS();
			
			Orcamento orcamento = new Orcamento(500.0);
			
			CalculadorDeImpostos calcula = new CalculadorDeImpostos();
			calcula.realizaCalculo(orcamento, iss);
			calcula.realizaCalculo(orcamento, icms);

	}


}
