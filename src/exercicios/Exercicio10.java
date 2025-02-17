package exercicios;
import java.util.Scanner;

// SOLICITAR 5 NUMEROS AO USUARIO COM O COMANDO WHILE
// EXIBIR O MAIOR NUMERO, MEDIA, SOMATORIO

public class Exercicio10 {
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);

        // declarar variaveis

        int contador = 1; // iniciar o contador
        int maior =0; // começar sempre valor baixo 0
        int soma = 0; // começar sempre valor baixo 0
        int numero;
        int media;

        while (contador <=5){ // solicita 5 numeros

            System.out.println("DIGITE O " + contador + " NÚMERO");
            numero = scanner.nextInt();

            // faz comparação numero maior

            if (numero > maior){
                maior = numero;

            }

            // faz a soma dentro do while
            soma += numero;

            // incrementa contador dentro do while
            contador++;

        }

        // faz a media fora do while
        media = soma / 5 ;

        // exibi os resultados
        System.out.println(" O MAIOR NÚMERO DIGITADO = " + maior);
        System.out.println(" SOMATORIO = " + soma);
        System.out.println(" MÉDIA = " + media );

    }


}
