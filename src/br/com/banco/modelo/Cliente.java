package br.com.banco.modelo;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    public void imprimirDadosCliente() {
        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
    }

}
