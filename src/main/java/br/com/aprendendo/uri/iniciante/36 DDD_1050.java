import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DDD {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();

        Map<Integer, String> ddds = getDDDsAvailable();

        String cidade = ddds.get(entrada);
        if (cidade == null) {
            System.out.println("DDD nao cadastrado");
        } else {
            System.out.println(cidade);
        }
    }

    public static Map<Integer, String> getDDDsAvailable() {
        Map<Integer, String> ddds = new HashMap<>();

        int[] digits = new int[] {61, 71, 11, 21, 32, 19, 27, 31};
        String[] cities = new String[] {"Brasilia", "Salvador", "Sao Paulo",
                                        "Rio de Janeiro", "Juiz de Fora",
                                        "Campinas", "Vitoria", "Belo Horizonte"};
        for (int i = 0; i < digits.length; ++i) {
            ddds.put(digits[i], cities[i]);
        }

        return ddds;
    }
}
