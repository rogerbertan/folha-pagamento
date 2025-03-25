package folha_pagamento;
public class Main {
    public static void main(String[] args) {
        Funcionario desenvolvedor1 = new Desenvolvedor("João", 5915);
        Funcionario desenvolvedor2 = new Desenvolvedor("Marcelo", 3400);
        Funcionario gerente1 = new Gerente("Maria", 12840);
        Funcionario estagiario1 = new Estagiario("José", 1500, 20);
        Funcionario estagiario2 = new Estagiario("Ana", 1200, 22);
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(desenvolvedor1);
        empresa.adicionarFuncionario(desenvolvedor2);
        empresa.adicionarFuncionario(gerente1);
        empresa.adicionarFuncionario(estagiario1);
        empresa.adicionarFuncionario(estagiario2);

        System.out.println("Nome: " + desenvolvedor1.getNome() + 
                           " - Cargo: " + desenvolvedor1.getClass().getSimpleName() + 
                           " - Salário Final: R$ " + String.format("%.2f", desenvolvedor1.calcularSalario()));
        System.out.println("Nome: " + desenvolvedor2.getNome() +
                           " - Cargo: " + desenvolvedor2.getClass().getSimpleName() +
                           " - Salário Final: R$ " + String.format("%.2f", desenvolvedor2.calcularSalario()));
        System.out.println("Nome: " + gerente1.getNome() +
                           " - Cargo: " + gerente1.getClass().getSimpleName() +
                           " - Salário Final: R$ " + String.format("%.2f", gerente1.calcularSalario()));
        System.out.println("Nome: " + estagiario1.getNome() +   
                           " - Cargo: " + estagiario1.getClass().getSimpleName() +
                           " - Salário Final: R$ " + String.format("%.2f", estagiario1.calcularSalario()));
        System.out.println("Nome: " + estagiario2.getNome() +
                           " - Cargo: " + estagiario2.getClass().getSimpleName() +
                           " - Salário Final: R$ " + String.format("%.2f", estagiario2.calcularSalario()));
        System.out.println("Total da Folha de Pagamento: R$ " + String.format("%.2f", empresa.calcularFolha()));

    }
}
