import java.io.IOException;
import java.util.Scanner;

public class O_Maior_1013 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] valoresStr = input.nextLine().split(" ");
        int[] valores = new int[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = Integer.parseInt(valoresStr[i]);
        }

        int maior = (valores[0] + valores[1] + Math.abs(valores[0] - valores[1])) / 2;
        maior = (valores[2] > maior) ? valores[2] : maior;
        System.out.format("%d eh o maior%n", maior);
    }
}
