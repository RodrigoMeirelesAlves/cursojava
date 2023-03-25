package leitao;

import java.util.Scanner;

public class Ex5 {
    /**
     *  Refatorar o exercício 04, utilizando a estrutura switch.
     *  Criar um programa que receba um número e diga se ele é um número primo.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contadorDeDivisores = 0;

        System.out.println("Digite um número para saber se ele é PRIMO: ");
            int numero = input.nextInt();

            for (int i = 2 ; i < numero ; i++){
                if(numero % i == 0){
                    contadorDeDivisores++;
                }
            }
        switch (contadorDeDivisores){
            case  0 :
                System.out.println("O número "  + numero  +  " é primo");
                break;
            default: {
                System.out.println("O número "  +  numero +   " não é primo");
                break;
            }
        }
            input.close();
    }

}
