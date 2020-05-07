import java.io.IOException;
import java.util.Scanner;

public class Sort_Simples_1042 {

    public static void main(String[] args) throws IOException {

        final int QTD_NUMEROS = 3;
        Scanner input = new Scanner(System.in);

        String[] entrada = input.nextLine().split(" ");
        int[] valores = new int[QTD_NUMEROS];
        int[] valoresOrdenados = new int[QTD_NUMEROS];

        for (int i = 0; i < QTD_NUMEROS; ++i) {
            valores[i] = Integer.parseInt(entrada[i]);
            valoresOrdenados[i] = valores[i];
        }

        ordenar(valoresOrdenados, QTD_NUMEROS);

        mostrarValores(valoresOrdenados, QTD_NUMEROS);
        System.out.format("%n");
        mostrarValores(valores, QTD_NUMEROS);
    }

    public static void mostrarValores(int[] valores, final int QTD_NUMEROS) {
        for (int i = 0; i < QTD_NUMEROS; ++i) {
            System.out.println(valores[i]);
        }
    }

    public static void ordenar(int[] valores, final int QTD_NUMEROS) {
        for (int i = 0; i < QTD_NUMEROS; ++i) {
            for (int j = 0; j < QTD_NUMEROS - 1; ++j) {
                if (valores[j] > valores[j + 1]) {
                    int a = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = a;
                }
            }
        }
    }
}
