import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("****************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************************");

        String menu = """
                \n*** Digite sua opção ***
                1 - Consultar saldo
                2 - Sacar valor
                3 - Depositar valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nO saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja sacar: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não é possível sacar um valor maior que o saldo atual da conta.");
                } else {
                    saldo -= valor;
                    System.out.println("Valor sacado: " + valor);
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja sacar: ");
                double valor = leitura.nextDouble();
                if (valor <= 0) {
                    System.out.println("Não é possível realizar o deposito de valores menores ou iguais a zero.");
                } else {
                    saldo += valor;
                    System.out.println("Valor depositado: " + valor);
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
