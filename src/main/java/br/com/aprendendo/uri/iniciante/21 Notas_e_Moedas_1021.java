import java.io.IOException;
import java.util.Scanner;

public class Notas_e_Moedas_1021 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        int[] qtdNotas = new int[notas.length];
        int[] qtdMoedas = new int[moedas.length];

        double valorInicial = input.nextDouble();
        // TAVA SÓ DANDO PAU, ENTÃO TIREI AS VIRGULAS
        double valor = valorInicial * 100;

        int i = 0;
        if(valor > 2.00 * 100) { 
            for (double nota : notas) {
                nota = nota * 100;
                qtdNotas[i] = (int) (valor / nota);
                valor = valor % nota;
                i++;
            }
        }

        i = 0;
        for (double moeda : moedas) {
            moeda = moeda * 100;
            qtdMoedas[i] = (int)(valor / moeda);
            valor = valor - (qtdMoedas[i] * moeda);
            i++;
        }

        System.out.println("NOTAS:");
        for (i = 0; i < notas.length; i++) {
            System.out.format("%d nota(s) de R$ %.2f%n", qtdNotas[i], notas[i]);
        }

        System.out.println("MOEDAS:");
        for (i = 0; i < moedas.length; i++) {
            System.out.format("%d moeda(s) de R$ %.2f%n", qtdMoedas[i], moedas[i]);
        }
    }
}
