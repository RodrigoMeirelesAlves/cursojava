package nelio.For;

import java.util.Scanner;

public class Ex3 {

    /**
     * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
     * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
     * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
     * peso 5
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = input.nextInt();


        for ( int i = 0 ; i < n ; i++){

            double caso1 = input.nextDouble();
            double caso2 = input.nextDouble();
            double caso3 = input.nextDouble();

            double media = (caso1 * 2.0 + caso2 * 3.0 + caso3 *5.0)/ 10.0;
            System.out.printf("%.1f%n" , media);
        }

        input.close();
    }
}
