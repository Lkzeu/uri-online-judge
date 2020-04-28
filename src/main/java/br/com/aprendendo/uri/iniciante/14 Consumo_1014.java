import java.io.IOException;
import java.util.Scanner;

public class Consumo_1014 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        final int distanciaPercorrida = input.nextInt();
        final double combustivelGasto = input.nextDouble();
        final double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.format("%.3f km/l%n", consumoMedio);
    }
}
