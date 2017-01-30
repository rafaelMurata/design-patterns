package br.com.rafaelmurata.patterns.strategy;

import java.util.List;

import br.com.rafaelmurata.patterns.chainsOfResponsability.Item;

public class Orcamento {

	public Orcamento(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	private final double valor;

	public List<Item> getItens() {
		return null;
	}
}
