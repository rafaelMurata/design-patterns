package br.com.rafaelmurata.state;

public class EmAprovacao implements EstadoDeUmOrcamento { 
	
	/*
      public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
      }
      */

	public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
      }

      public void aprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de aprovado
        orcamento.estadoAtual = new Aprovado();
      }

      public void reprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de reprovado tambem
        orcamento.estadoAtual = new Reprovado();
      }

      public void finaliza(Orcamento orcamento) {
        // daqui n�o posso ir direto para finalizado
        throw new RuntimeException("Orcamento em aprova��o n�o podem ir para finalizado diretamente");
      }
 }