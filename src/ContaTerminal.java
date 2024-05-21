import java.util.Scanner;

import classes.Conta;

public class ContaTerminal {
    public static void main(String[] args) {
        //Incia o scanner para coletar as entradas do usuario
        Scanner scanner = new Scanner(System.in);

        //Coleta as informações digitadas pelo usuario
        System.out.println("Porfavor digita o numero da conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Porfavor digita o numero da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Porfavor digite o nome do representante!");
        String nome = scanner.nextLine();

        System.out.println("Porfavor digite o valor do deposito inicial! (exemplo 999,99)");
        Double saldo = scanner.nextDouble();

        //Incia a classe conta criando uma conta bancaria
        Conta conta = new Conta(numeroConta, agencia, nome, saldo);

        //Mostra para o usuario em caso de sucesso ao criar a conta
        System.out.println(
            "Ola " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
            + " já está disponível para saque."
        );

        //encerra o scanner
        scanner.close();
    }
}