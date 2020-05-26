//Tempo_de_Jogo_com_Minutos_1047

import java.io.IOException;
import java.util.Scanner;

public class Tempo_de_Jogo_com_Minutos_1047 { //TempodeJogo {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();

        System.out.println(calcularTempoDeJogo(entrada));
    }

    public static String calcularTempoDeJogo(String entradaBruta) {
        String[] entrada = entradaBruta.split(" ");
        int[] valores = converteEntradaEmValores(entrada);

        int[] horaEMinuto = fazerCalculo(valores[0], valores[1], valores[2], valores[3]);
        String stringFormatada = String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",
                                                horaEMinuto[0], horaEMinuto[1]);
        return stringFormatada;
    }

    private static int[] fazerCalculo(int horaInicial, int minutoInicial,
                                        int horaFinal, int minutoFinal) {

        int tempoInicialAbsoluto = (horaInicial * 3600) + (minutoInicial * 60);
        int tempoFinalAbsoluto = (horaFinal * 3600) + (minutoFinal * 60);

        if (tempoFinalAbsoluto <= tempoInicialAbsoluto)
            tempoFinalAbsoluto += 24 * 3600;

        int total = tempoFinalAbsoluto - tempoInicialAbsoluto;
        int hora = total / 3600;
        int minuto = (total % 3600) / 60;

        return new int[] {hora, minuto};
    }

    private static int[] converteEntradaEmValores(String[] entrada) {
        int[] valores = new int[4];

        for (int i = 0; i < 4; ++i) {
            valores[i] = Integer.parseInt(entrada[i]);
        }
        return valores;
    }
}
