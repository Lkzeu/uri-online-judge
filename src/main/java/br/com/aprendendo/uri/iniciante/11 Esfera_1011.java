import java.io.IOException;
import java.util.Scanner;

public class Esfera_1011 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        double raio = input.nextDouble();
        double volume = (4 / 3.0) * PI * (raio * raio * raio);

        System.out.format("VOLUME = %.3f%n", volume);
    }
}
