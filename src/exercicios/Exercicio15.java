package exercicios;

// MOSTRE NA TELA USANDO O COMANDO FOR , MAIOR , NUMERO, SOMATORIO, MEDIA usuario digite 5 notas

import java.util.Scanner;
public class Exercicio15 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        // varaiveis
        double numero;
        double maior = 0;
        double soma = 0;
        double media;

        for(int contador =1;contador <=5;contador++){

            System.out.println("DIGITE O " + contador + " NÚMERO");
            numero = scanner.nextDouble();

            if (numero > maior){
                maior = numero;
            }

            // faz a soma dentro do for
            soma += numero;

        }

          // faz a media fora do for
            media = soma / 5;

        // Exibe os resultados

        System.out.println("MAIOR NÚMERO = " + maior);
        System.out.println("SOMATORIO = " + soma);
        System.out.println("MÉDIA = " + media);


    }

}

