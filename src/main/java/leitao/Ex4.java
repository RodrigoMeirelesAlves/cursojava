package leitao;

import java.util.Scanner;

public class Ex4 {

    /**Criar um programa que receba um número e diga se ele é um número primo.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      int contadorDeDivisores= 0;

        System.out.println("Digite um número para saber se é primo: ");
            int numero = sc.nextInt();

            for (int i = 2 ; i < numero; i++){
                if ( numero % i == 0 ){
                    contadorDeDivisores++;
                }
            }
            if (contadorDeDivisores == 0 ) {
                System.out.println("O número "  + numero +  "é primo.");
            }else {
                System.out.println("O número "  + numero +  "não é primo.");
            }

        sc.close();
    }
}
