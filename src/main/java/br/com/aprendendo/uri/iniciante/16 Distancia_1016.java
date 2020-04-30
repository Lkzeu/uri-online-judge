import java.io.IOException;
import java.util.Scanner;

public class Distancia_1016 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int km = input.nextInt();
        int minutos = km * 2;

        System.out.format("%d minutos%n", minutos);
    }
}
