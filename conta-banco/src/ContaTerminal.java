import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o código da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu primiro nome de cliente!");
        String primeiroNome = scanner.next();
        System.out.println("Por favor, digite o seu sobrenome de cliente!");
        String sobreNome = scanner.next();
        
        String nome = primeiroNome + " " + sobreNome;


        System.out.println("Por favor, digite o saldo atual!");
        double saldo = scanner.nextDouble();
        System.out.println(saldo);

    
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero);
        System.out.printf(" e seu saldo %.2f já está disponível para saque.", saldo);
        scanner.close();
    }
}
