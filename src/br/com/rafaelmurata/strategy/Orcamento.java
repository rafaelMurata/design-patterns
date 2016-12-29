package br.com.rafaelmurata.strategy;

import java.util.List;

import br.com.rafaelmurata.chainsOfResponsability.Item;

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
