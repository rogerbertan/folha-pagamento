package folha_pagamento;

public class Desenvolvedor extends Funcionario {
    private double bonus;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase, 22);
        this.bonus = salarioBase * 0.1;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}
