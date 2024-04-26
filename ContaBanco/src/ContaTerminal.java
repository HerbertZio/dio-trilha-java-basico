import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Solicitar e armazenar o número da Agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // TODO: Solicitar e armazenar o número da Conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha pendente

        // TODO: Solicitar e armazenar o nome do Cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // TODO: Solicitar e armazenar o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // TODO: Exibir a mensagem formatada com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}