package domain;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private double saldo;

    private void sacar(){}

    private void depositar(){}

    private void transferir(){}

    public ContaCorrente() {
    }

    public ContaCorrente(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
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

}
