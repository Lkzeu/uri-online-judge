import java.io.IOException;
import java.util.Scanner;

public class Teste_de_Selecao_1035 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] valores = input.nextLine().split(" ");

        final int A = Integer.parseInt(valores[0]);
        final int B = Integer.parseInt(valores[1]);
        final int C = Integer.parseInt(valores[2]);
        final int D = Integer.parseInt(valores[3]);

        if (((A % 2) == 0) && (C > 0) && (D > 0) && (B > C) && (D > A) && (C + D > A + B)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
