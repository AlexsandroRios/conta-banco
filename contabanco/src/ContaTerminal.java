import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("- - Cadastro - -");
        System.out.print("Digite o número da conta: ");
        numeroConta = texto.nextInt();texto.nextLine();
        System.out.print("Informe a agência: ");
        agencia = texto.nextLine();
        System.out.print("Digite o seu nome completo: ");
        nomeCliente = texto.nextLine();
        System.out.print("Informe o depósito inicial: ");
        saldo = texto.nextDouble();texto.nextLine();texto.close();
        System.out.println("Cadastro realizado com sucesso, segue informações da conta.");
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s,\nconta %s e seu saldo R$%.2f já está disponível para saque.",nomeCliente,agencia,numeroConta,saldo);
    }
}