import java.io.IOException;
import java.util.Scanner;

public class Tipos_de_Triangulos_1045 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] entrada = input.nextLine().split(" ");
        final double A = Double.parseDouble(entrada[0]);
        final double B = Double.parseDouble(entrada[1]);
        final double C = Double.parseDouble(entrada[2]);

        if (A + B > C && A + C > B && B + C > A) {
            tipoTriangulo(A, B, C);
            isIsoscelesOuEquilatero(A, B, C);
        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }
    }

    public static void tipoTriangulo(double a, double b, double c) {
        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;
        double b2c2 = b2 + c2;
        double a2b2 = a2 + b2;
        double a2c2 = a2 + c2;

        // se o quadrado de um lado for igual a soma dos quadrados dos dois
        // outros lados, então é um triangulo retangulo
        if (a2 == b2c2 || b2 == a2c2 || c2 == a2b2) {
            System.out.println("TRIANGULO RETANGULO");

        // se o quadrado de um lado for maior que a soma dos quadrados dos dois
        // outros lados, então é um triangulo obtusangulo
        } else if (a2 > b2c2 || b2 > a2c2 || c2 > a2b2) {
            System.out.println("TRIANGULO OBTUSANGULO");

        // se o quadrado de um lado for menor que a soma dos quadrados dos dois
        // outros lados, então é um triangulo acutangulo 
        } else if (a2 < b2c2 || b2 < a2c2 || c2 < a2b2) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
    }

    public static void isIsoscelesOuEquilatero(double a, double b, double c) {
        if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || a == c || c == b) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
