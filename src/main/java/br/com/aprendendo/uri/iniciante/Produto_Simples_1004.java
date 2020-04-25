import java.util.Scanner;

public class Produto_Simples_1004 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int X = input.nextInt();
        final int Y = input.nextInt();
        final int PROD = X * Y;

        System.out.format("PROD = %d%n", PROD);
    }
}
