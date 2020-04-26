import java.util.Scanner;

public class Media1_1005 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double A = input.nextDouble();
        final double B = input.nextDouble();

        final double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.format("MEDIA = %.5f%n", MEDIA);
    }
}
