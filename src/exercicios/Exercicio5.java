package exercicios;
import java.util.Scanner;

// VERIFICAR SE UM NUMERO É PAR OU IMPAR

public class Exercicio5 {
    public static void main (String []args){

       // cria objeto scanner ler
       Scanner scanner = new Scanner(System.in);

       System.out.print("DIGITE UM NÚMERO : ");
       int numero = scanner.nextInt();

       // condição

        if (numero % 2 == 0){

            System.out.print(numero + " É PAR !");
        }

        else {

            System.out.print(numero + " É ÍMPAR !");
        }


    }

}
