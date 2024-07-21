import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Ensure consistent decimal separator

        System.out.println("Por favor digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor seu nome: ");
        String nome_cliente = scanner.next();

        double saldo = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Por favor digite o saldo da conta: ");
                saldo = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato inválido. Por favor, digite um número no formato correto (exemplo: 123.45).");
                scanner.next(); // Clear the incorrect input
            }
        }

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
