package nelio.For;

import java.util.Scanner;

public class Ex6 {

    /**
     *Ler um número inteiro N e calcular todos os seus divisores
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <=n ; i++){
            if ( n % i ==0 ){
                System.out.println(i);
            }
        }

    }

}
