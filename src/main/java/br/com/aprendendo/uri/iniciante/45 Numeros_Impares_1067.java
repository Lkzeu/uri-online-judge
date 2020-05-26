import java.io.IOException;
import java.util.Scanner;

public class Numeros_Impares_1067 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
    
        for(int i = 1; i <= number; ++i) {
            if(i % 2 != 0)
                System.out.println(i);
        }  

        input.close();
    }
}