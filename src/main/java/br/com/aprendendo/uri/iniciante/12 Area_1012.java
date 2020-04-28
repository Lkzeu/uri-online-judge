import java.io.IOException;
import java.util.Scanner;

public class Area_1012 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        String[] valores = input.nextLine().split(" ");
        final double A = Double.parseDouble(valores[0]);
        final double B = Double.parseDouble(valores[1]);
        final double C = Double.parseDouble(valores[2]);

        double areaTrianguloRetan = (A * C) / 2.0;
        double areaCirculo = PI * (C * C);
        double areaTrapezio = (C * (A + B)) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        printar("TRIANGULO", areaTrianguloRetan);
        printar("CIRCULO", areaCirculo);
        printar("TRAPEZIO", areaTrapezio);
        printar("QUADRADO", areaQuadrado);
        printar("RETANGULO", areaRetangulo);
    }

    public static void printar(String identificador, double valor) {
        System.out.format("%s: %.3f%n", identificador, valor);
    }
}
