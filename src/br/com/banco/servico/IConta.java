package br.com.banco.servico;

import br.com.banco.conta.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);

    void imprimirExtrato();

}
