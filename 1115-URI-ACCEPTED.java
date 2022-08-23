import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0.0){
                if(y > 0.0)
                System.out.println("primeiro");
                else
                System.out.println("quarto");
            } else {
                if(y > 0.0)
                System.out.println("segundo");
                else
                System.out.println("terceiro");
            }

            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
