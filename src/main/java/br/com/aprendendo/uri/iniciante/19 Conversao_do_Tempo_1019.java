import java.io.IOException;
import java.util.Scanner;

public class Conversao_do_Tempo_1019 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int segundosInicial = input.nextInt();

        int horas = segundosInicial / 3600;
        segundosInicial = segundosInicial % 3600;
        int minutos = segundosInicial / 60;
        segundosInicial = segundosInicial % 60;
        int segundos = segundosInicial;

        System.out.format("%d:%d:%d%n", horas, minutos, segundos);
    }
}
