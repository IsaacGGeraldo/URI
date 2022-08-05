import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        input.nextLine();
        int hours = input.nextInt();
        input.nextLine();
        double price = input.nextDouble();

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f%n", hours*price );
        
        input.close();
    }
}