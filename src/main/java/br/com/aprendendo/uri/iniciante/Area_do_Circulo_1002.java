// area = π . raio2. Considerando para este problema que π = 3.14159:

import java.util.Scanner;

public class Area_do_Circulo_1002 {

    public static void main(String[] args) {
        
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double area = PI * (raio * raio);

        System.out.format("A=%.4f%n", area);
    }
}
