import java.io.IOException;
import java.util.Scanner;

public class Numeros_Positivos {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double[] entrada = new double[6];
        for (int i = 0; i < entrada.length; ++i) {
            entrada[i] = input.nextDouble();
        }

        int counter = 0;
        for(double value : entrada) {
            if(value > 0) {
                ++counter;
            }
        }

        System.out.format("%d valores positivos%n", counter);
    }
}
