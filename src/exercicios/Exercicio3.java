package exercicios;

import java.util.Scanner;

// PROGRAMA QUE CALCULE AUMENTO DE SALARIO

public class Exercicio3 {

    public static void main (String [] args){

        // CRIA OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O SALARIO ATUAL : ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("DIGITE % AUMENTO : ");
        int bonusSalario = scanner.nextInt();

        // FAZ O CALCULO

        double salarioAumento = ( salarioAtual * bonusSalario) / 100;
        double salarioFinal = (salarioAumento + salarioAtual);

        // EXIBE RESULTADOS FORMATADOS

        System.out.printf("SALARIO TEVE AUMENTO DE R$ %.2f ficando R$ %.2f ",salarioAumento,salarioFinal);
    }



}
