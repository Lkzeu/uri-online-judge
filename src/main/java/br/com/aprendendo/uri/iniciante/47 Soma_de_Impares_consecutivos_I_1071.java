package br.com.aprendendo.uri.emProcesso;

import java.io.IOException;
import java.util.Scanner;

public class Soma_de_Impares_consecutivos_I_1071 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int menor = input.nextInt();
        int maior = input.nextInt();

        if (menor > maior) {
            int swap = maior;
            maior = menor;
            menor = swap;
        }

        int soma = 0;
        for(int i = menor + 1; i < maior; ++i) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        input.close();
    }
}