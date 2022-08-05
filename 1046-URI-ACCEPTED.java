import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        if (end > start)
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (end - start));
        else
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (24 - start + end));

        input.close();
    }
}
