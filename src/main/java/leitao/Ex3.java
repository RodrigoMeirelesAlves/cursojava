package leitao;

import java.util.Scanner;

public class Ex3 {

    /**Criar um programa que receba duas notas parciais, calcular a média final.
     * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
     * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
     * caso contrário imprime no console "Reprovado".
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
            float nota1 = sc.nextFloat();
        System.out.println("Digite 2ª nota: ");
            float nota2 = sc.nextFloat();
        float media = (nota1 + nota2 ) / 2;

        if ( media >= 7.0f  && media <= 10.0f ){
            System.out.println("Aprovado e sua média " + media);
        } else if (media < 7.0 && media >= 4.0f) {
            System.out.println(" Recuperação e sua média " + media);
        } else {
            System.out.println("Reprovado e sua média "  + media);
        }
        sc.close();
    }
}
