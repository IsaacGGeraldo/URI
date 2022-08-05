import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Double[] prices = {4.0, 4.5, 5.0, 2.0, 1.5};
        
        int product = input.nextInt();
        int amount = input.nextInt();

        System.out.printf("Total: R$ %.2f%n", (prices[product-1] * amount));

        input.close();
    }
}
