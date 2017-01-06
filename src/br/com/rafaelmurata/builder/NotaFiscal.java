package br.com.rafaelmurata.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSolcial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	
	public NotaFiscal(String razaoSolcial, String cnpj, Calendar dataDeEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		super();
		this.razaoSolcial = razaoSolcial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}
	public String getRazaoSolcial() {
		return razaoSolcial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public double getImpostos() {
		return impostos;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public List<ItemDaNota> itens;
	public String observacoes;

}
