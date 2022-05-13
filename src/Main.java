import domain.*;

public class Main {

    public static void main(String[] args) {

        Cliente josef = new Cliente("Josef");

        Conta cc = new ContaCorrente(josef);
        Conta cp = new ContaPoupanca(josef);

        cc.depositar(200);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }





}
