import java.io.IOException;
import java.util.Scanner;

public class Pares_Impares_Positivos_e_Negativos_1066 {
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        final int NUMERO_DE_ENTRADAS = 5;
        int number = 0;
        
        int positivos = 0;
        int negativos = NUMERO_DE_ENTRADAS;
        int pares = 0;
        int impares = NUMERO_DE_ENTRADAS;

        for (int i = 0; i < NUMERO_DE_ENTRADAS; ++i) {
            number = input.nextInt();

            if (number % 2 == 0) {
                ++pares;
                --impares;
            }
            if (number > 0) {
                ++positivos;
                --negativos;
            } else if (number == 0) {
                --negativos;
            } 
        }

        System.out.format("%d valor(es) par(es)%n" +
                          "%d valor(es) impar(es)%n" +
                          "%d valor(es) positivo(s)%n" +
                          "%d valor(es) negativo(s)%n",
                          pares, impares, positivos, negativos);
        input.close();
    }
}