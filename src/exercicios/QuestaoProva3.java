package exercicios;

// 9. Faça um código em Java que mostra tela todos os números entre 1 e 500 que sejam pares e mostre o somatório deles (3 pontos).

public class QuestaoProva3 {

    public static void main (String [] args){

    int soma = 0;

    for ( int contador =1; contador <=500;contador ++){

        if (contador %2 == 0){

            System.out.println(contador);
            soma += contador;

         }

       }
        // exibi resultado
        System.out.println("SOMATORIO DOS NÚMEROS PARES = " +soma);

    }
}
