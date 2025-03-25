# Folha de Pagamento

Este projeto em Java simula um sistema de gerenciamento de folha de pagamento para uma empresa, permitindo o cálculo de salários de diferentes tipos de funcionários.

## Funcionalidades
- Adicionar funcionários à empresa
- Calcular salário de diferentes tipos de funcionários
- Exceção personalizada para validar dias trabalhados
- Cálculo da folha de pagamento total da empresa

## Estrutura do Projeto
```
folha_pagamento/
|– src/
|   |– folha_pagamento/
|   |   |– Main.java
|   |   |– Empresa.java
|   |   |– Funcionario.java
|   |   |– Desenvolvedor.java
|   |   |– Gerente.java
|   |   |– Estagiario.java
|   |   |– DiasTrabalhadosException.java
|– .gitgnore
|– README.md
```
## Como Executar
1.   Clone o repositório:
```sh
git clone https://github.com/seu-usuario/gestao-funcionarios.git
cd gestao-funcionarios
```
2.	Compile os arquivos Java:
```sh
javac -d out/ src/folha_pagamento/*.java
```
3.  Execute a aplicação:
```sh
java -cp out/ folha_pagamento.Main
```

## Exemplo de Saída
```
Nome: João - Cargo: Desenvolvedor - Salário Final: R$ 6506.50
Nome: Marcelo - Cargo: Desenvolvedor - Salário Final: R$ 3740.00
Nome: Maria - Cargo: Gerente - Salário Final: R$ 15408.00
Nome: José - Cargo: Estagiario - Salário Final: R$ 1363.64
Nome: Ana - Cargo: Estagiario - Salário Final: R$ 1200.00
Total da Folha de Pagamento: R$ 28218.14
```

## Melhorias Futuras
- Persistência de dados em arquivo ou banco de dados
- Interface gráfica para interação com o usuário
- Integração com API para gestão de RH
