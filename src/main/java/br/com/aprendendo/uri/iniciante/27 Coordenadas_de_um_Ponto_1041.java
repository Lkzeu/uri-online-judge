import java.io.IOException;
import java.util.Scanner;

public class Coordenadas_de_um_Ponto_1041 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] coordenadas = input.nextLine().split(" ");
        double x = Double.parseDouble(coordenadas[0]);
        double y = Double.parseDouble(coordenadas[1]);

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
}
