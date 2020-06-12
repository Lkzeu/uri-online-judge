package br.com.aprendendo.uri.emProcesso;

import java.io.IOException;
import java.util.Scanner;

public class Par_Impar_1074 {

    public static String avaliar(int number) {
        String positive = "";
        String odd = "ODD";
        
        if (number > 0)
            positive = "POSITIVE";
        else if (number < 0)
            positive = "NEGATIVE";
        
        if (number % 2 == 0)
            odd = "EVEN";

        if (positive.isEmpty())
            return "NULL";
        return odd + " " + positive;
    }
    
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.println(avaliar(input.nextInt()));
        }

        input.close();
    }
}