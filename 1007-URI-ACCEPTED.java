import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        input.nextLine();
        int second = input.nextInt();
        input.nextLine();
        int third = input.nextInt();
        input.nextLine();
        int fourth = input.nextInt();

        System.out.println("DIFERENCA = " + (first * second - third * fourth));
        
        input.close();
    }
}