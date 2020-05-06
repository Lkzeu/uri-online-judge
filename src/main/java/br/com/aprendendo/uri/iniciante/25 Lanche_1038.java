import java.io.IOException;
import java.util.Scanner;

public class Lanche_1038 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double[] lanche = {4.00, 4.50, 5.00, 2.00, 1.50};
        String[] entrada = input.nextLine().split(" ");

        int cod = Integer.parseInt(entrada[0]);
        int qtd = Integer.parseInt(entrada[1]);

        double valor = lanche[cod - 1] * qtd;
        System.out.format("Total: R$ %.2f%n", valor);
    }
}
