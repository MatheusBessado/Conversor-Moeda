💰 Sistema de Cofrinho de Moedas
Este projeto foi desenvolvido como parte de uma atividade prática acadêmica (Faculdade UNINTER) para a disciplina de Programação Orientada a Objetos em Java. O objetivo é simular um cofrinho capaz de armazenar diferentes tipos de moedas e realizar conversões de câmbio.

📋 Sobre o Projeto
O software é uma aplicação via console (CLI) que permite ao usuário gerenciar um cofrinho virtual. O sistema suporta múltiplas moedas (Real, Dólar e Euro) e utiliza polimorfismo para tratar comportamentos específicos de cada uma, como cotação e exibição de informações.

Funcionalidades Principais
Adicionar Moedas: Permite inserir valores em Real, Dólar ou Euro.

Remover Moedas: Retira uma moeda específica do cofrinho.

Listar Moedas: Exibe todo o conteúdo atual do cofrinho.

Conversão Total: Calcula e exibe o valor total acumulado no cofrinho, convertendo todas as moedas estrangeiras para Real (R$) com base em uma cotação fixa.

🛠️ Tecnologias e Conceitos Utilizados
Linguagem: Java

Herança e Classes Abstratas: A classe Moeda serve como base para Real, Dolar e Euro.

Polimorfismo: Métodos como converter() e info() comportam-se de maneira diferente dependendo da instância da moeda.

Collections: Uso de ArrayList para o gerenciamento dinâmico da lista de moedas.

📂 Estrutura do Projeto
O código está organizado no pacote uninter:

Main.java: Ponto de entrada da aplicação.

Menu.java: Gerencia a interação com o usuário e o loop principal do programa.

Cofrinho.java: Classe contêiner que gerencia a lista de moedas.

Moeda.java: Classe abstrata mãe.

Real.java, Dolar.java, Euro.java: Classes filhas com taxas de conversão específicas (Dólar: 5.7, Euro: 6.0).

🚀 Como Executar
Certifique-se de ter o Java JDK instalado.

Compile os arquivos:

Bash

javac uninter/*.java
Execute o programa:

Bash

java uninter.Main
