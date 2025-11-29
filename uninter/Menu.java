package uninter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Cofrinho cofrinho;  // Supondo que você tenha a classe Cofrinho para armazenar as moedas

    public Menu() {
        cofrinho = new Cofrinho();  // Instanciando o cofrinho
    }

    public void exibirMenu() {
        String opcao;

        do {
            System.out.println("\n--- Cofrinho Matheus Bessado RU: 4712789---");
            System.out.println("1- Adicionar Moeda");
            System.out.println("2- Remover Moeda");
            System.out.println("3- Listar Moedas");
            System.out.println("4- Calcular o valor total convertido para real");
            System.out.println("0- Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.next();  // Lê a opção do menu

            sc.nextLine(); // Limpa o buffer de entrada, evitando problemas com o nextLine() nas próximas entradas

            switch (opcao) {
                case "1":
                    adicionarMoeda();
                    break;
                case "2":
                    removerMoeda();
                    break;
                case "3":
                    listarMoedas();
                    break;
                case "4":
                    calcularValorConvertido();
                    break;
                case "0":
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (!opcao.equals("0"));
        
        sc.close();
    }

    private void adicionarMoeda() {
        System.out.println("Escolha o tipo da moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");

        String tipoMoeda = sc.nextLine();
        System.out.print("Digite o valor da moeda: ");
        double valor = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer

        switch (tipoMoeda) {
            case "1":
                cofrinho.adicionarMoeda(new Real(valor));  // Adiciona a moeda Real
                break;
            case "2":
                cofrinho.adicionarMoeda(new Dolar(valor));  // Adiciona a moeda Dólar
                break;
            case "3":
                cofrinho.adicionarMoeda(new Euro(valor));  // Adiciona a moeda Euro
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
        }
    }

    private void removerMoeda() {
        System.out.println("Escolha o tipo da moeda a ser removida:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");

        String tipoMoeda = sc.nextLine();
        System.out.print("Digite o valor da moeda para remoção: ");
        double valor = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer

        switch (tipoMoeda) {
            case "1":
                cofrinho.removerMoeda(new Real(valor));  // Remove a moeda Real
                break;
            case "2":
                cofrinho.removerMoeda(new Dolar(valor));  // Remove a moeda Dólar
                break;
            case "3":
                cofrinho.removerMoeda(new Euro(valor));  // Remove a moeda Euro
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
        }
    }

    private void listarMoedas() {
        cofrinho.listarMoedas();
    }

    private void calcularValorConvertido() {
        double valorTotal = cofrinho.calcularValorConvertido();
        System.out.println("O valor total convertido para real é: R$" + valorTotal);
    }
}


	
    
