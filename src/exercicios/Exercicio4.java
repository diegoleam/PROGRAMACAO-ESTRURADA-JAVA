package exercicios;

import java.util.Scanner;

// FAZ A MEDIA DOS ALUNOS

public class Exercicio4 {

    public static void main (String []args){

        // CRIAR OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE A PRIMEIRA NOTA");
        double nota1 = scanner.nextDouble();

        System.out.println("DIGITE A SEGUNDA NOTA");
        double nota2 = scanner.nextDouble();

        System.out.println("DIGITE A TERCEIRA NOTA");
        double nota3 = scanner.nextDouble();

        // FORMULA CALCULAR A MEDIA
        double media = (nota1+nota2+nota3)/ 3;

        // FAZ A VERFICAÇÃO

        if (media >=70){
            System.out.println("ALUNO APROVADO");
        }
        else if (media <70 && media >=50) {
            System.out.println("ALUNO EM RECUPERAÇÃO");
        }
        else {
            System.out.println("ALUNO REPROVADO");

        }

    }


}
