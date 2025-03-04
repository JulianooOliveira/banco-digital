package br.com.banco.banco;

public class Banco {

    private static final String NOME = "Banco Fictício";
    private static final int CODIGO = 480;
    private static final int AGENCIA = 0001;

    public static String getNome() {
        return NOME;
    }

    public static int getCodigo() {
        return CODIGO;
    }

    public static int getAgencia() {
        return AGENCIA;
    }

}
