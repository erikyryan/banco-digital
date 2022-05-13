package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private final List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta - " + conta.getNumero() + " aprovada!");
    }
}
