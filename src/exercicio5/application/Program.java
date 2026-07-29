package exercicio5.application;

import java.util.Locale;
import java.util.Scanner;
import exercicio5.entities.Bank;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank banco;

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Deseja fazer um depósito (s/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Digite o valor de depósito: ");
            double depositoInicial = sc.nextDouble();
            banco = new Bank(numero, nome, depositoInicial);
        } else {
            banco = new Bank(numero, nome);
        }

        System.out.println("Dados da conta: ");
        System.out.println(banco);

        System.out.println("Digite um valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        banco.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(banco);

        System.out.println("Digite um valor de saque: ");
        double valorSaque = sc.nextDouble();
        banco.saque(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(banco);

        sc.close();
    }
}
