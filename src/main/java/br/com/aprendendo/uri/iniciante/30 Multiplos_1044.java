import java.io.IOException;
import java.util.Scanner;

public class Multiplos_1044 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] entrada = input.nextLine().split(" ");
        final int a = Integer.parseInt(entrada[0]);
        final int b = Integer.parseInt(entrada[1]);

        if (a > b) {
            isMultiplo(a, b);
        } else {
            isMultiplo(b, a);
        }
    }

    public static void isMultiplo(int maior, int menor) {
        int resto = maior % menor;
        if (resto == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
