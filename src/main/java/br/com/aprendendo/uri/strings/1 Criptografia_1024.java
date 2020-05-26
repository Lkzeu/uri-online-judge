import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Criptografia_1024 {

    public static String movesThreeCharsToRight(String str) {
        byte A = 65;
        byte Z = 90;
        byte a = 97;
        byte z = 122;

        byte[] cripto = new byte[str.length()];
        String strFinal = "";

        try {
            byte[] strBytes = str.getBytes("US-ASCII");
            for (int i = 0; i < strBytes.length; ++i) {
                byte charInByte = strBytes[i];

                if ((charInByte >= A && charInByte <= Z) || 
                        (charInByte >= a && charInByte <= z)) {
                    charInByte += 3;
                }

                cripto[i] = charInByte;
            }
            strFinal = new String(cripto, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return strFinal; 
    }

    public static String strReversed(String str) {
        String reversedString = "";
        int size = str.length();
        if (size == 1) 
            return str;
        else
            reversedString = strReversed(str.substring(1, size)) + str.charAt(0);
        return reversedString;
    }

    public static String truncateAndMovesSecondPartOneCharToLeft(String str) {
        StringBuilder secondPart = new StringBuilder();
        int startIndex = str.length() / 2;
        for (int i = startIndex; i < str.length(); ++i) {
            byte bt = (byte) (str.charAt(i) - 1);
            secondPart.append((char) bt); 
        }
        return str.substring(0, startIndex) + secondPart.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int numberOfStrings = input.nextInt();
        input.nextLine();
        
        String[] criptoStr = new String[numberOfStrings];
        String[] entradas = new String[numberOfStrings];

        for (int i = 0; i < entradas.length; i++) {
            entradas[i] = input.nextLine();
        }

        int i = 0;
        for (String str : entradas) {
            str = movesThreeCharsToRight(str);
            str = strReversed(str);
            str = truncateAndMovesSecondPartOneCharToLeft(str);
            criptoStr[i] = str;
            ++i;
        }

        for (String string : criptoStr) {
            System.out.println(string);
        }

        input.close();
    }
}