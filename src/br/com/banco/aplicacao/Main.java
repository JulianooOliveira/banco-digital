package br.com.banco.aplicacao;

import br.com.banco.conta.Conta;
import br.com.banco.conta.ContaCorrente;
import br.com.banco.modelo.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juliano", "123.456.789-00", "Rua 1, 123");

        Conta contaCorrente = new ContaCorrente(cliente1);

        contaCorrente.imprimirExtrato();
        contaCorrente.depositar(500);
        contaCorrente.imprimirExtrato();
        contaCorrente.sacar(100);
        contaCorrente.imprimirExtrato();

    }
}
