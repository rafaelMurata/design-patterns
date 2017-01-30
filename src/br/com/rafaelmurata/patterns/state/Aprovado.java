package br.com.rafaelmurata.patterns.state;

public class Aprovado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.02;
      }

      public void aprova(Orcamento orcamento) {
        // jah estou em aprovacao
        throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
      }

      public void reprova(Orcamento orcamento) {
        // nao pode ser reprovado agora!
        throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
      }

      public void finaliza(Orcamento orcamento) {
        // daqui posso ir para o estado de finalizado
        orcamento.estadoAtual = new Finalizado();
      }
}