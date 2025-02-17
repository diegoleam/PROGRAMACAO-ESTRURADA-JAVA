package exercicios;

// COMANDO WHILE DE 1 ATE 500 NUMEROS PARES E MOSTRAR O SOMATORIO

public class Exercicio9 {

    public static void main (String [] args){


        // inicia contador
        int contador = 1;
        int soma = 0;

        while (contador <= 500){

            if (contador % 2 == 0){

                System.out.println(contador);
                soma += contador;

            }

            // incrementa fora do if
            contador += 1;
        }

        // EXIBI O RESULTADO
        System.out.println(" O SOMATORIO DE 1 A 500 = " + soma);

    }

}
