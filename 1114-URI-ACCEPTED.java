import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        String password = input.nextLine();

        while (!password.equals("2002")){
            System.out.println("Senha Invalida");
            password = input.nextLine();
        }

        System.out.println("Acesso Permitido");

        input.close();
    }
}
