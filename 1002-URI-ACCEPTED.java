import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;

        //System.out.print("Type the radius of the circle: ");
        double radius = input.nextDouble();
        
        System.out.printf("A=%.4f%n", (pi * Math.pow(radius, 2)));
        
        input.close();
    }
}