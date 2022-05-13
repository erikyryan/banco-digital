package domain;

public abstract class Conta implements IConta{
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private final Cliente cliente;


    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s\n",cliente.getNome());
        System.out.printf("Agencia: %d\n",agencia);
        System.out.printf("Numero: %d\n",numero);
        System.out.printf("Saldo: %.2f\n",saldo);
    }

    public Conta(Cliente cliente){
        agencia = Conta.AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
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