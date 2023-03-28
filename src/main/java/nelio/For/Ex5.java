package nelio.For;

import java.util.Scanner;

public class Ex5 {

    /**
     *Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial
     * de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
     * Lembrando que, por definição, fatorial de 0 é 1.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = input.nextInt();
        int fatorial = 1;

        for ( int i = 1 ; i <= numero;i++){
            fatorial = fatorial* i;
            System.out.println(fatorial);
        }
         input.close();
    }
}
