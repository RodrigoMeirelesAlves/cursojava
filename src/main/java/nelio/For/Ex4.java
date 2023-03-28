package nelio.For;

import java.util.Scanner;

public class Ex4 {

    /**
     * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
     * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for ( int i = 0; i < n ; i++){

            int numero1 = input.nextInt();
            int numero2 = input.nextInt();
            if (numero2 ==0){
                System.out.println("Divisão impossível");
            } else {
                double div = (double) numero1/numero2;
                System.out.printf("%.2f%n" ,div);
            }
        }
        input.close();
    }
}
