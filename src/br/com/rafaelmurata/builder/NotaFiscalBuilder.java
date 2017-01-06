package br.com.rafaelmurata.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String comObservacao;
	private Calendar data;
	
	public NotaFiscalBuilder paraEmpresa(String rezaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilder comCnpj(String rezaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilder comItem(ItemDaNota item){
		todosItens.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor() * 0.05;
		return this;

	}
	public NotaFiscalBuilder comObservacao(String observacao){
		this.comObservacao= observacao;
		return this;

	}
	public NotaFiscalBuilder naDataAtual() {
		this.data= Calendar.getInstance();
		return this;

	}
	public NotaFiscal constroi(){
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosItens, comObservacao);
	}
}
