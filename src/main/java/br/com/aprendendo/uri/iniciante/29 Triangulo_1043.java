import java.io.IOException;
import java.util.Scanner;

public class Triangulo_1043 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] entrada = input.nextLine().split(" ");
        double A = Double.parseDouble(entrada[0]);
        double B = Double.parseDouble(entrada[1]);
        double C = Double.parseDouble(entrada[2]);

        if (A + B > C && A + C > B && B + C > A) {
            double perimetro = A + B + C;
            System.out.format("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((A + B) * C) / 2;
            System.out.format("Area = %.1f%n", area);
        }
    }
}
