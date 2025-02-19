package exercicios;

import java.util.ArrayList;
public class Exercicio16 {
  public static void main (String [] args){

      ArrayList<String> pessoa = new ArrayList<>();

      // adiciona pessoas a lista
          pessoa.add("DIEGO");
          pessoa.add("MARIA");
          pessoa.add("HOJE");

          // EXIBI

      System.out.println(pessoa.get(0)); // EXIBI PRIMEIRO NOME
      System.out.println(pessoa.size());  // Exibir os dados

      // EXIBI LISTA UM POR UM
      for (int lista = 0; lista < pessoa.size(); lista++) {
          System.out.println(pessoa.get(lista));

      }
  }
}