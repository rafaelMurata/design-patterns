package br.com.rafaelmurata.solid.heranca;

public class ContaDeEstudante {

	private ManipuladorDeSaldo manipulador;

	private int milhas;
	
	ContaDeEstudante()
	{
		manipulador= new ManipuladorDeSaldo();
	}
	public void deposita(double valor){
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}
	public void rende(){
		throw new RuntimeException("Não pode render");
	}
	public int getMilhas() {
		return milhas;
	}
}
