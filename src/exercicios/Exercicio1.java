package exercicios;

// Exercicio 1 variaveis e tipos

public class Exercicio1 {

    public static void main (String []args){

     // VARIAVIES

     String nome = "DIEGO";        // TEXTO
     int idade = 33;              // NÚMERO INTEIRO
     double altura = 1.71;       // NÚMERO CASA DECIMAIS
     char sexo = 'M';           // UNICO CARACTERE
     boolean estudante = true; // LOGICO VERDADEIRO OU FALSO

     // EXIBI INFORMAÇÕES SIMPLES
        System.out.println("NOME "+ nome);
        System.out.println("IDADE "+ idade);
        System.out.println("ALTURA" + altura);
        System.out.println("SEXO "+ sexo);
        System.out.println("ESTUDANTE ?"+ estudante);

     // EXIBE INFORMAÇÕES FORMATADA

     System.out.printf("%s tem %d anos, sua altura é %.2f metros do sexo %c e %b",nome,idade,altura,sexo,estudante);

    }


}
