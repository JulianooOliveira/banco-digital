package br.com.banco.conta;

import br.com.banco.modelo.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta poupança ===");
        super.imprimirInfosComuns();
    }

}
