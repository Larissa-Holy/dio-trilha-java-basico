import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá, digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = entrada.nextInt();

        System.out.print("Por favor, digite seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
               nome, agencia, numeroConta, saldo);

    }

}
