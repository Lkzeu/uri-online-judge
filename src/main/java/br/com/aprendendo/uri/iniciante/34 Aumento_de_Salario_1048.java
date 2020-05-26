import java.util.Scanner;
import java.io.IOException;

public class Aumento_de_Salario {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double currentSalary = input.nextDouble();
        System.out.println(reajustarSalario(currentSalary));
    }

    public static String reajustarSalario(double currentSalary) {
        double porcentagem = 0.15; // 15 % no caso de 0 - 400;

        if (currentSalary > 2000.00) {
            porcentagem = 0.04;
        } else if (currentSalary > 1200.00) {
            porcentagem = 0.07;
        } else if (currentSalary > 800.00) {
            porcentagem = 0.10;
        } else if (currentSalary > 400.00) {
            porcentagem = 0.12;
        }

        Double aumento = currentSalary * porcentagem;
        String novoSalario = Double.toString(currentSalary + aumento);

        String porcentagemDeAumento = (int)(porcentagem * 100.0) + " %";

        return formatarSaida(novoSalario, Double.toString(aumento),
                                                porcentagemDeAumento);
    }

    public static String formatarSaida(String... resultado) {
        String saidaPadrao = "Novo salario: %.2f%n" +
                             "Reajuste ganho: %.2f%n" +
                             "Em percentual: %s";

        double novoSalario = Double.parseDouble(resultado[0]);
        double reajusteGanho = Double.parseDouble(resultado[1]);
        String emPercentual = resultado[2];

        return String.format(saidaPadrao, novoSalario,
                                            reajusteGanho, emPercentual);
    }
}
