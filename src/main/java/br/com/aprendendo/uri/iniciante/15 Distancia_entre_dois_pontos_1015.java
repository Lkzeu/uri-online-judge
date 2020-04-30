import java.io.IOException;
import java.util.Scanner;

public class Distancia_entre_dois_pontos_1015 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] p1 = input.nextLine().split(" ");
        String[] p2 = input.nextLine().split(" ");

        double x = Double.parseDouble(p2[0]) - Double.parseDouble(p1[0]);
        double y = Double.parseDouble(p2[1]) - Double.parseDouble(p1[1]);
        double result = Math.sqrt((x * x) + (y * y));

        System.out.format("%.4f%n", result);
    }
}
