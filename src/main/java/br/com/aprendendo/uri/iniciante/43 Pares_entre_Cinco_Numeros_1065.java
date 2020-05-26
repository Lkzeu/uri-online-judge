// package br.com.aprendendo.uri.emProcesso;
import java.io.IOException;
import java.util.Scanner;

public class Pares_entre_Cinco_Numeros_1065 {
    public static void main(String[] args) throws IOException {
        int number = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; ++i) {
            number = input.nextInt();
            if (number % 2 == 0) {
                ++counter;
            }
        }

        System.out.format("%d valores pares%n", counter);
    }
}