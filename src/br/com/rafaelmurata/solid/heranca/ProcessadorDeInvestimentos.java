package br.com.rafaelmurata.solid.heranca;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
}
