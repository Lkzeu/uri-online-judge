import java.io.IOException;
import java.util.Scanner;

public class Intervalo_1037 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();

        if (x >= 0 && x <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (x > 0 && x <= 50.00) {
            System.out.println("Intervalo (25,50]");
        } else if (x > 0 && x <= 75.00) {
            System.out.println("Intervalo (50,75]");
        } else if (x > 0 && x <= 100.00) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
