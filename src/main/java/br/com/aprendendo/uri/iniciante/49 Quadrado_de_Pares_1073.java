package br.com.aprendendo.uri.emProcesso;

import java.io.IOException;
import java.util.Scanner;

public class Quadrado_de_Pares_1073 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 2; i <= n; i+=2) {
            System.out.format("%d^2 = %d%n", i, i * i);
        }

        input.close();
    }
}