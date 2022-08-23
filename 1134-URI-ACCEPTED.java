import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int buyed = 0;
        int gasoline = 0;
        int alcohol = 0;
        int diesel = 0;

        while (buyed != 4) {
            buyed = input.nextInt();

            switch (buyed){
                case 1:
                    alcohol++;
                    break;
                case 2:
                    gasoline++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcohol);
        System.out.printf("Gasolina: %d\n", gasoline);
        System.out.printf("Diesel: %d\n", diesel);

        input.close();
    }
}
