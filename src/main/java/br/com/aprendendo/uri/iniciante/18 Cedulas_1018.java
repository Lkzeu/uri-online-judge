import java.io.IOException;
import java.util.Scanner;

public class Cedulas_1018 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] qtdNotas = new int[7];
        int valorInicial = input.nextInt();
        int valor = valorInicial;

        int i = 0;
        for (int nota : notas) {
            qtdNotas[i] = valor / nota;
            valor = valor % nota;
            i++;
        }

        System.out.println(valorInicial);
        for (i = 0; i < 7; i++) {
            System.out.format("%d nota(s) de R$ %d,00%n", qtdNotas[i], notas[i]);
        }
    }
}
