import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Revisao_Contrato_1120 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
    
        String  valorOriginalDatilografado, digitoQuebrado;
        BigInteger valorImpresso;
        
        while (true) {
            String[] entrada = input.nextLine().split(" ");
            digitoQuebrado = entrada[0];
            valorOriginalDatilografado = entrada[1];
            
            if (digitoQuebrado.equals("0") && valorOriginalDatilografado.equals("0")) { break;}
            
            String strFinal = valorOriginalDatilografado.replaceAll(digitoQuebrado, "");
            if (strFinal.isEmpty()) {
                valorImpresso = new BigInteger("0");
            } else {
                valorImpresso = new BigInteger(strFinal);    
            }
            
            System.out.println(valorImpresso);
        }
        input.close();
    }
}