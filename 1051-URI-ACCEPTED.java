import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double tax = 0.0;
        
        double salary = input.nextDouble();
        
        if (salary <= 2000.0)
            System.out.println("Isento");
        else {
            if (salary > 4500.0) {
                tax += (salary - 4500.0) * 0.28;
                salary -= (salary - 4500.0);
            }
            if (salary > 3000.0) {
                tax += (salary - 3000.0) * 0.18;
                salary -= (salary - 3000.0);
            }
            if (salary > 2000.0) {
                tax += (salary - 2000.0) * 0.08;
            }
            
            System.out.printf("R$ %.2f%n", tax);
        }

        input.close();
    }
}

