import java.io.IOException;
import java.util.Scanner;

public class Mes_1052 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        String[] meses = {"January", "February", "March", "April", "May", "June", "July",
                          "August", "September", "October", "November",  "December"};

        System.out.println(meses[i - 1]);
    }
}
