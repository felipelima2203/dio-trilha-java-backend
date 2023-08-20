import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int account_number;
        String name;
        String agency;
        float balance=0;

        System.out.println("Por favor, digite seu nome");
        name = sc.nextLine();
        System.out.println("Digite o número da agência");
        agency = sc.nextLine();
        System.out.println("Digite o número da conta");
        account_number = sc.nextInt();
        System.out.println("Digite o valor do saldo inicial");
        balance = sc.nextFloat();

        System.out.println("Olá "  + name + ", obrigado por criar uma conta em " +
                "nosso banco, sua agência é " + agency + ", conta " + account_number +
                " seu saldo " + balance + " já está disponível para saque.");

        sc.close();
    }
}