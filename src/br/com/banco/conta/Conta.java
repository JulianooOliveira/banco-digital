package br.com.banco.conta;

import br.com.banco.banco.Banco;
import br.com.banco.modelo.Cliente;
import br.com.banco.servico.IConta;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 0000001;

    protected String banco;
    protected int codigoBanco;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.codigoBanco = Banco.getCodigo();
        this.banco = Banco.getNome();
        this.agencia = Banco.getAgencia();
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        System.out.println("=== Saque ===");
        System.out.println("Digite o valor para saque: ");
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para saque");
            return;
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque");
            return;
        } else if (valor > 1000) {
            System.out.println("Valor máximo para saque é de R$ 1000,00 por dia.");
            return;
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque");
            return;
        } else {
            this.saldo -= valor;
            System.out.println("Valor sacado R$ " + valor);
        }

    }

    @Override
    public void depositar(double valor) {
        System.out.println("=== Deposito ===");
        System.out.println("Digite o valor para depósito: ");

        if (valor <= 0) {
            System.out.println("Valor inválido para depósito");
            return;
        } else if (valor > 10000) {
            System.out.println("Valor máximo para depósito é de R$ 10.000,00 por dia.");
            return;
        } else {
            this.saldo += valor;
            System.out.println("Valor depositado R$ " + valor);
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para transferência");
            return;
        } else if (valor <= 0) {
            System.out.println("Valor inválido para transferência");
            return;
        } else if (valor > 5000) {
            System.out.println("Valor máximo para transferência é de R$ 5.000,00 por dia.");
            return;
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para transferência");
            return;
        } else {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Codigo do Banco: %d", this.codigoBanco));
        System.out.println(String.format("Banco: %s", this.banco));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Endereco: %s", this.cliente.getEndereco()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
