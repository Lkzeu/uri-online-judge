import java.io.IOException;
import java.util.Scanner;

public class Seis_Numeros_Impares_1070 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 0;

        for(int i = number; counter < 6; ++i) {
            if(i % 2 != 0) {
                System.out.println(i);
                ++counter;
            }
        }
        input.close();
    }
}