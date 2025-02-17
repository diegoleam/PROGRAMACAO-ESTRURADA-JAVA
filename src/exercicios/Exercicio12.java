package exercicios;

// Implemente um programa em Java que simule um jogo de adivinhação

import java.util.Scanner;
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_SECRETO = 100; // Número secreto como constante

        System.out.println("========= JOGO DE ADIVINHAÇÃO =========");
        System.out.println("DICA: O NÚMERO É PAR E ESTÁ ENTRE 1 E 100");

        int numero = 0;

        while (numero != NUMERO_SECRETO) { // Continua até o número ser 100

            System.out.print("\nDigite um número: ");
            numero = scanner.nextInt();

            if (numero != NUMERO_SECRETO) {
                System.out.println("❌ Número errado! Tente novamente.");
            } else {
                System.out.println("\n🎉 Parabéns! Você acertou o número: " + numero);
            }
        }

        System.out.println("===== FIM DO JOGO =====");
        scanner.close();
    }
}