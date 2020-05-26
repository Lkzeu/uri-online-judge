package br.com.aprendendo.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Duracao_Evento_1061 {

    private static int[] fazerCalculo(int horaInicial, int minInicial, int segInicial,
                                int horaFinal, int minFinal, int segFinal, int dias) {

        int tempoInicialAbsoluto = (horaInicial * 3600) + (minInicial * 60) + segInicial;
        int tempoFinalAbsoluto = (horaFinal * 3600) + (minFinal * 60) + segFinal;

        if (tempoFinalAbsoluto <= tempoInicialAbsoluto) {
            tempoFinalAbsoluto += 24 * 3600;
            --dias;
        }

        int total = tempoFinalAbsoluto - tempoInicialAbsoluto;
        int hora = total / 3600;
        int minuto = (total % 3600) / 60;
        int segundo = (total % 3600) % 60;

        return new int[] {dias, hora, minuto, segundo};
    }

    public static int getData(Scanner input) {
        String[] data = input.nextLine().split(" ");
        return Integer.parseInt(data[1]);
    }

    public static int[] getHorario(Scanner input) {
        String[] horario = input.nextLine().split(" : ");
        int[] horaMinSeg = new int[horario.length];
        for (int i = 0; i < horario.length; ++i) {
            horaMinSeg[i] = Integer.parseInt(horario[i]);
        }

        return horaMinSeg;
    }
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int diaInicial = getData(input);
        int[] horarioInicial = getHorario(input);

        int diaFinal = getData(input);
        int[] horarioFinal = getHorario(input);

        int[] array = fazerCalculo(horarioInicial[0], horarioInicial[1], horarioInicial[2],
                                   horarioFinal[0], horarioFinal[1], horarioFinal[2],
                                   diaFinal - diaInicial);

        System.out.format("%d dia(s)%n" +
                          "%d hora(s)%n" +
                          "%d minuto(s)%n" +
                          "%d segundo(s)%n", array[0], array[1], array[2], array[3]);
    }
}
