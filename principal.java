package cofrinho;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cofrinho cofrinho = new cofrinho();

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n===== COFRINHO =====");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total em reais");
            System.out.println("5 - Sair");

            // Substituir sc.nextInt() por lerInteiro(sc)
            opcao = lerInteiro(sc);

            switch (opcao) {

                case 1:
                    System.out.println("Escolha:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");

                    // Substituir sc.nextInt() por lerInteiro(sc)
                    int tipo = lerInteiro(sc);

                    System.out.println("Digite o valor:");
                    // Substituir sc.nextDouble() por lerDouble(sc)
                    double valor = lerDouble(sc);

                    if (tipo == 1) {
                        cofrinho.adicionar(new dolar(valor));
                    } else if (tipo == 2) {
                        cofrinho.adicionar(new euro(valor));
                    } else if (tipo == 3) {
                        cofrinho.adicionar(new real(valor));
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    System.out.println("Digite o valor da moeda:");
                    // Substituir sc.nextDouble() por lerDouble(sc)
                    double valorRemover = lerDouble(sc);

                    cofrinho.removerPorValor(valorRemover);
                    break;

                case 3:
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    System.out.println("Total em reais: " + cofrinho.totalConvertido());
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
    
    // Método para ler um número inteiro com tratamento de erro
    public static int lerInteiro(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Valor inválido! Digite apenas números.");
                sc.next(); // limpa a entrada inválida
                System.out.print("Digite novamente: ");
            }
        }
    }
    
    // Método para ler um número decimal com tratamento de erro
    public static double lerDouble(Scanner sc) {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Valor inválido! Digite apenas números (ex: 10.50).");
                sc.next(); // limpa a entrada inválida
                System.out.print("Digite novamente: ");
            }
        }
    }
}