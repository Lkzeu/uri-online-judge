import java.io.IOException;
import java.util.Scanner;

public class Tempo_de_Jogo_1046 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] entrada = input.nextLine().split(" ");
        int comecoDoJogo = Integer.parseInt(entrada[0]);
        int fimDoJogo = Integer.parseInt(entrada[1]);

        if(fimDoJogo <= comecoDoJogo) {
            fimDoJogo += 24;
        }

        int duracao = fimDoJogo - comecoDoJogo;

        System.out.format("O JOGO DUROU %d HORA(S)%n", duracao);
    }
}
