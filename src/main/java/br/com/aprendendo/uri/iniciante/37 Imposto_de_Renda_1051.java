import java.io.IOException;
import java.util.Scanner;

public class Imposto_de_Renda {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double entrada = input.nextDouble();

        double tirarDoCalculo = 0.0;
        double imposto = 0.0;

        if (entrada > 4500.00) {
            imposto = (entrada - 4500.00) * 0.28;
            entrada = 4500.00;
        }
        if (entrada > 3000.00) {
            imposto += (entrada - 3000.00) * 0.18;
            entrada = 3000.00;
        }
        if (entrada > 2000.00) {
            imposto += (entrada - 2000.00) * 0.08;
        }

        if (imposto != 0.0)
            System.out.println("Isento");
        else
            System.out.format("R$ %.2f%n", imposto);
    }
}
