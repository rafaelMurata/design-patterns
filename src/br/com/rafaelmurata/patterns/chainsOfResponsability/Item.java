package br.com.rafaelmurata.patterns.chainsOfResponsability;

public class Item {

	private final String nome;
	private final double valor;
	
	public Item(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
}
