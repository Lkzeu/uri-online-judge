import java.util.Scanner;

public class Diferenca_1007 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int A = input.nextInt();
        final int B = input.nextInt();
        final int C = input.nextInt();
        final int D = input.nextInt();

        final int DIFERENCA = (A * B) - (C * D);

        System.out.format("DIFERENCA = %d%n", DIFERENCA);
    }
}
