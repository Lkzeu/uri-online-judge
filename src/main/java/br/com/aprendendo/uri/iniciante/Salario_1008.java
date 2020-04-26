import java.util.Scanner;

public class Salario_1008 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int ID_FUNCIONARIO = input.nextInt();
        final int HORAS_TRABALHADAS = input.nextInt();
        final double VALOR_POR_HORA_TRABALHADA = input.nextDouble();

        final double SALARIO = HORAS_TRABALHADAS * VALOR_POR_HORA_TRABALHADA;

        System.out.format("NUMBER = %d%nSALARY = U$ %.2f%n",
                          ID_FUNCIONARIO, SALARIO);
    }
}
