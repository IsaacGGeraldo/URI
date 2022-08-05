import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        // input.nextLine();

        System.out.printf("TRIANGULO: %.3f%n", (a * c / 2));
        System.out.printf("CIRCULO: %.3f%n", (pi * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", (((a+b) * c) / 2));
        System.out.printf("QUADRADO: %.3f%n", (Math.pow(b, 2)));
        System.out.printf("RETANGULO: %.3f%n", (a * b));

        input.close();
    }
}
