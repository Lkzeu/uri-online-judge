import java.io.IOException;
import java.util.Scanner;

public class Idade_em_Dias_1020 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] diaAnoeMes = {365, 30};
        int[] idade = new int[3];
        String[] ids = {"ano(s)", "mes(es)", "dia(s)"};

        int diasTotais = input.nextInt();

        int i = 0;
        for (int qtdDias : diaAnoeMes) {
            idade[i] = diasTotais / qtdDias;
            diasTotais = diasTotais % qtdDias;
            i++;
        }
        idade[2] = diasTotais;

        for (i = 0; i < 3; i++) {
            System.out.format("%d %s%n", idade[i], ids[i]);
        }
    }
}
