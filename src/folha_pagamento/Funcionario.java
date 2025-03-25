package folha_pagamento;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;
    private int diasTrabalhados;

    public Funcionario(String nome, double salarioBase, int diasTrabalhados) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salário base não pode ser negativo");
        }else if (diasTrabalhados < 0 || diasTrabalhados > 22) {
            throw new DiasTrabalhadosException("Dias trabalhados devem estar entre 0 e 22");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.diasTrabalhados = diasTrabalhados;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getdiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setsalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setdiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
}
