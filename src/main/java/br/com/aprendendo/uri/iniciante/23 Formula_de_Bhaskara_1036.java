import java.io.IOException;
import java.util.Scanner;

public class Formula_de_Bhaskara_1036 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String[] valores = input.nextLine().split(" ");

        final double A = Double.parseDouble(valores[0]);

        if (A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            final double B = Double.parseDouble(valores[1]);
            final double C = Double.parseDouble(valores[2]);

            double delta = (B * B) -4 * A * C;
            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                delta = Math.sqrt(delta);
                double r1 = (-B + delta) / (2 * A);
                double r2 = (-B - delta) / (2 * A);

                System.out.format("R1 = %.5f%n", r1);
                System.out.format("R2 = %.5f%n", r2);
            }
        }
    }
}
