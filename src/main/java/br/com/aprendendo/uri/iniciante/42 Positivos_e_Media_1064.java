package br.com.aprendendo.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Positivos_e_Media_1064 {
    public static void main(String[] args) throws IOException{
        double number = 0.0;
        double sum = 0.0;
        int counter = 0; 
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 6; ++i) {
            number = input.nextDouble();
            if (number > 0) {
                ++counter;
                sum += number;
            }
        }

        double avg = sum / counter;
        System.out.format("%d valores positivos%n%.1f%n", counter, avg);
    }
}