import java.io.IOException;
import java.util.Scanner;

public class Media3_1040 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] entradaDeValores = input.nextLine().split(" ");
        int[] pesosDasNotas = {2, 3, 4, 1};
        int somaDosPesos = 10;
        double[] notas = new double[4];
        int somaDasNotas = 0;

        for (int i = 0; i < 4; ++i) {
            notas[i] = Double.parseDouble(entradaDeValores[i]);
            somaDasNotas += (int)(notas[i] * 10) * pesosDasNotas[i];
        }

        int media1EmInt = calcularMedia(somaDasNotas, somaDosPesos);
        double media1 = media1EmInt / 10.0;
        System.out.format("Media: %.1f%n", media1);

        if(media1 >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media1 < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaDoExame = input.nextDouble();
            System.out.format("Nota do exame: %.1f%n", notaDoExame);
            int notaDoExameInt = (int)(notaDoExame * 10);

            int media2EmInt = calcularMedia(media1EmInt + notaDoExameInt, 2);
            double media2 = media2EmInt / 10.0;
            if (media2 >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.format("Media final: %.1f%n", media2);
        }
    }

    public static int calcularMedia(int somatorio, int dividirPor) {
        return somatorio / dividirPor;
    }
}
