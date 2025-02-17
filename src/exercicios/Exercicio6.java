package exercicios;

import java.util.Scanner;

// CALCULADORA 4 OPERAÇÕES MATEMATICAS COM MENU 

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        while (true) { // Loop infinito até o usuário escolher sair

            // Exibir menu de opções
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("[1] - SOMA");
            System.out.println("[2] - SUBTRAÇÃO");
            System.out.println("[3] - DIVISÃO");
            System.out.println("[4] - MULTIPLICAÇÃO");
            System.out.println("[0] - SAIR");

            // Pedir escolha ao usuário
            System.out.print("DIGITE UMA OPÇÃO: ");
            escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("PROGRAMA ENCERRADO !");
                break; // Sai do loop e encerra o programa
            }

            if (escolha >= 1 && escolha <= 4) {
                System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
                double numero1 = scanner.nextDouble();

                System.out.print("DIGITE O SEGUNDO NÚMERO: ");
                double numero2 = scanner.nextDouble();

                double resultado = 0;
                boolean operacaoValida = true;

                switch (escolha) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.printf("\nRESULTADO: %.2f + %.2f = %.2f%n", numero1, numero2, resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.printf("\nRESULTADO: %.2f - %.2f = %.2f%n", numero1, numero2, resultado);
                        break;
                    case 3:
                        if (numero2 == 0) {
                            System.out.println("\nERRO: Divisão por zero não permitida.");
                            operacaoValida = false;
                        } else {
                            resultado = numero1 / numero2;
                            System.out.printf("\nRESULTADO: %.2f / %.2f = %.2f%n", numero1, numero2, resultado);
                        }
                        break;
                    case 4:
                        resultado = numero1 * numero2;
                        System.out.printf("\nRESULTADO: %.2f * %.2f = %.2f%n", numero1, numero2, resultado);
                        break;
                }

                // Aguarda o usuário pressionar ENTER antes de reiniciar
                if (operacaoValida) {
                    System.out.println("\n PRECIONE ENTER PARA UMA NOVA OPERAÇÃO");
                    scanner.nextLine(); // Captura a quebra de linha pendente
                    scanner.nextLine(); // Aguarda o ENTER
                }
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA! Escolha um número entre 0 e 4.");
            }
        }

        scanner.close();
    }
}
