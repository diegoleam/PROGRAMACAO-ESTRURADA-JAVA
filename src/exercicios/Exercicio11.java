package exercicios;

// IMPRIMA NA TELA DE 0 A 100 0S NUMEROS PARES E MULTIPLOS DE 5 COMANDO WHILE

public class Exercicio11 {

   public static void main (String [] args) {

       int contador = 0;

       while (contador <= 100) {

           if (contador % 2 == 0 && contador % 5 == 0) {

               System.out.println(contador);

           }

           // incrementa fora do if
           contador++;


        }
    }
}
