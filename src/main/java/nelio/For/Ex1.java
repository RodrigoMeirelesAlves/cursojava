package nelio.For;

import java.util.Scanner;

public class Ex1 {

    /**
     * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
     * X, se for o caso
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
            int numero = input.nextInt();

            for (int x = 1 ; x < numero ; x+=2 ){
                System.out.println("X = "  + x );

            }

            input.close();

    }

}
