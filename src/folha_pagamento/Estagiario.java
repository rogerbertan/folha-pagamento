package folha_pagamento;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase, int diasTrabalhados) {
        super(nome, salarioBase, diasTrabalhados);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() / 22 * getdiasTrabalhados();
    }
}
