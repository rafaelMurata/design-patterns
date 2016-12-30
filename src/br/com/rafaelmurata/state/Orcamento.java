package br.com.rafaelmurata.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.rafaelmurata.chainsOfResponsability.Item;

public class Orcamento {

	/*
	 Este é o problema
	  private double valor;
      private int estadoAtual;
	  public static final int EM_APROVACAO = 1;
      public static final int APROVADO = 2;
      public static final int REPROVADO = 3;
      public static final int FINALIZADO = 4;
      
      public void aplicaDescontoExtra() {
        if(estadoAtual == EM_APROVACAO) valor = valor - (valor * 0.05);
        else if(estadoAtual == APROVADO) valor = valor - (valor * 0.02);
        else throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
      }
	 */
	protected double valor;
    protected EstadoDeUmOrcamento estadoAtual; // veja a mudança aqui
	private final List<Item> itens;
	
	public Orcamento(double valor) {
		super();
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	public double getValor() {
		return valor;
	}
	public void adicionaItem(Item item){
		itens.add(item);
	}
    public void aplicaDescontoExtra() {
  	    estadoAtual.aplicaDescontoExtra(this);
  	}
  	 public void aprova() {
  	    estadoAtual.aprova(this);
  	 }
  	 public void reprova() {
  	    estadoAtual.reprova(this);
  	 }
  	 public void finaliza() {
  	    estadoAtual.finaliza(this);
  	 }
    
}
