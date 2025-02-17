package exercicios;
import java.util.Scanner;

// 8. Faça um código em Java que leia o nome do usuário e a idade e mostre na tela o ano que ele nasceu (2 pontos).

public class QuestaoProva2 {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE SEU NOME ");
        String nome = scanner.nextLine();

        System.out.println("DIGITE SUA IDADE");
        int idade = scanner.nextInt();

        int anoNascimento = 2025 - idade;

        System.out.println(nome + " NASCEU EM " +anoNascimento);

    }

}
