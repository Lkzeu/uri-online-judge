import java.util.Scanner;

public class Media2_1006 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double A = input.nextDouble();
        final double B = input.nextDouble();
        final double C = input.nextDouble();

        final double MEDIA = ((A * 2) + (B * 3) + C * 5) / 10;

        System.out.format("MEDIA = %.2f%n", MEDIA);

    }
}
