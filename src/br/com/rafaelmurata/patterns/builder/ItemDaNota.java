package br.com.rafaelmurata.patterns.builder;

public class ItemDaNota {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	private double valor;
	
	public ItemDaNota(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

}
