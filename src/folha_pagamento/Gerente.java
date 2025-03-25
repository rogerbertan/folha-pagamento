package folha_pagamento;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase, 22);
        this.bonus = salarioBase * 0.2;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}
