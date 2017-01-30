package br.com.rafaelmurata.patterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.rafaelmurata.patterns.builder.boasPraticas.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String comObservacao;
	private Calendar data;
	
	private List<AcaoAposGerarNota> todasAcoesAseremExecutadas;
	
	public NotaFiscalBuilder() {
		this.todasAcoesAseremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	public void adicionaAcao(AcaoAposGerarNota acao ){
		this.todasAcoesAseremExecutadas.add(acao);
	}
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
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosItens, comObservacao);
	
		for (AcaoAposGerarNota acao : todasAcoesAseremExecutadas) {
			acao.executa(nf);
		}
		return nf;
	}


	
}
