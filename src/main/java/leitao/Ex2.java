package leitao;

import java.util.Scanner;

/**Criar um programa informa se o ano atual é um ano bissexto;
 * */
public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual");
            int ano = sc.nextInt();

            boolean bisexto = ano % 4 == 0 && ((ano % 100 ) != 0 || ano % 400 == 0);

                if ( bisexto == true){
                    System.out.println( ano +  " É um ano bisexto ");
                } else  {
                System.out.println( ano + " Não é um ano bisexto");
        }

            sc.close();

    }
}
