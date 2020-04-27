import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Salario_com_Bonus_1009 {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner input = new Scanner(System.in);

        final String NOME_DO_VENDEDOR = input.next();
        final double SALARIO_FIXO = input.nextDouble();
        final double VENDAS_EFETUADAS = input.nextDouble();

        double total = SALARIO_FIXO + VENDAS_EFETUADAS * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
