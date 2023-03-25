package leitao;

import java.util.Scanner;

public class Ex1 {

    /**Criar um programa que receba um número e
     * verifique se ele está entre 0 e 10 e é par.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Digite um número: ");
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 10 ){
                if (numero % 2 == 0){
                    System.out.println("Número "  + numero +  " está entre 0 e 10 e é par");
                } else {
                    System.out.println("Número "  + numero +  " esta entre 0 e 10 e nao é par");
                }
                   } else {
                    System.out.println("Número "  + numero +  " não esta entre 0 e 10");
                }


            sc.close();
    }
}
