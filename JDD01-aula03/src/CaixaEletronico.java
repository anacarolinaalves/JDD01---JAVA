import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 0, valor;
        System.out.println("Bem vindo ao Banco FIAP");

        do {
            System.out.println("\nOperações disponíveis neste caixa:");
            System.out.println("1 - Depósito\t2 - Saque");
            System.out.println("3 - Consultar Saldo\t4 - Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    valor = leitor.nextDouble();
                    if (valor > 0) {
                        saldo += valor;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    valor = leitor.nextDouble();
                    if (valor > 0 && valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;
                case 3:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Banco FIAP.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        leitor.close();
    }
}
