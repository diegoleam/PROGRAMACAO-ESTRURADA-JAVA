package exercicios;
import java.util.Scanner;

// OPERAÇÕES MATEMATICAS

public class Exercicio2 {
    public static void main (String []args){

        // CRIA O OJETO SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O PRIMEIRO NÚMERO = ");
        int numero1 = scanner.nextInt();

        System.out.print("DIGITE O SEGUNDO NÚMERO = ");
        int numero2 = scanner.nextInt();

        // EXIBI OS RESULTADOS

        // SOMA
        System.out.println("SOMA DOS NÚMEROS = " + (numero1 + numero2));

        // SUBTRAÇÃO
        System.out.println("SUBTRAÇÃO DOS NÚMEROS = " + (numero1 - numero2));

        // DIVISÃO
        System.out.println("DIVISÃO DOS NÚMEROS = " + (numero1 / numero2));

        // MULTIPLICAÇÃO
        System.out.println("MULTIPLICAÇÃO DOS NÚMEROS = " + (numero1 * numero2));

    }

}
