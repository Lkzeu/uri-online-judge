/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor
unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
*/
import java.util.Scanner;

public class Calculo_Simples_1010 {

    public static void main (String... args) {
        Scanner input = new Scanner(System.in);

        String[] peca1 = input.nextLine().split(" ");
        String[] peca2 = input.nextLine().split(" ");

        double total = (Integer.parseInt(peca1[1]) * Double.parseDouble(peca1[2])) +
                       (Integer.parseInt(peca2[1]) * Double.parseDouble(peca2[2]));

        System.out.format("VALOR A PAGAR: R$ %.2f%n", total);
    }

    /* VERSAO MAIS ESCALÁVEL
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int qtdPecas = 2;

        Peca[] pecas = new Peca[qtdPecas];
        for (int i = 0; i < qtdPecas; i ++) {
            pecas[i] = new Peca(input.nextLine());
        }

        double total = 0.0;
        for (Peca peca : pecas ) {
            total += peca.calcularValor();
        }

        System.out.format("VALOR A PAGAR: R$ %.2f%n", total);
    }
}

class Peca {
    int codPeca, qtdPeca;
    double valor;

    Peca(String lido) {
        String[] coluna = lido.split(" ");

        this.codPeca = Integer.parseInt(coluna[0]);
        this.qtdPeca = Integer.parseInt(coluna[1]);
        this.valor   = Double.parseDouble(coluna[2]);
    }

    double calcularValor() {
        return this.qtdPeca * this.valor;
    }
} */
