import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int code1 = input.nextInt();
        int amount1 = input.nextInt();
        double price1 = input.nextDouble();
        input.nextLine();

        int code2 = input.nextInt();
        int amount2 = input.nextInt();
        double price2 = input.nextDouble();
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (amount1 * price1 + amount2 * price2));
        
        input.close();
    }
}