package br.com.aprendendo.uri.emProcesso;

import java.io.IOException;
import java.util.Scanner;

public class Intervalo_2_1072 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int numeroDeTestes = input.nextInt();
        
        int in = 0;
        int out = numeroDeTestes;
        
        for(int i = 0; i < numeroDeTestes; ++i) {
            int numero = input.nextInt();
            if (numero >= 10 && numero <= 20) {
                in += 1;
                out -= 1;
            }
        }

        System.out.format("%d in%n%d out%n", in, out);
        input.close();
    }
}