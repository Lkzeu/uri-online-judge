import java.io.IOException;
import java.util.Scanner;

public class Gasto_de_Combustivel_1017 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int horasViajando = input.nextInt();
        int velocidadeMedia = input.nextInt();
        int distancia = horasViajando * velocidadeMedia;

        System.out.format("%.3f%n", distancia / 12.0);
    }
}
