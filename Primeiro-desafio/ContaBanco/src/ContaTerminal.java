import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenomenome!");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite a agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        double saldo = 237.48;


        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " reais já está disponível para saque");

        scanner.close();
    }
}