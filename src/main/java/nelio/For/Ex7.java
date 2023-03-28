package nelio.For;

import java.util.Scanner;

public class Ex7 {
    /**
     *Fazer um programa para ler um número inteiro positivo N.
     * O programa deve então mostrar na tela N linhas,
     * começando de 1 até N. Para cada linha, mostrar o número da linha,
     * depois o quadrado e o cubo do valor, conforme
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for ( int i = 1 ; i <= n ;i++){
            int primeiro = i;
            int seguendo= i* i;
            int terceiro =i*i*i;

            System.out.printf("%d %d %d\n" , primeiro,seguendo,terceiro);
        }
        input.close();
    }
}
