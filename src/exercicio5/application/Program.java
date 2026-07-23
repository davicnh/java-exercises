package exercicio5.application;

import java.util.Locale;
import java.util.Scanner;
import exercicio5.entities.Bank;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank banco = new Bank();

        System.out.printf("Digite o número da conta: ");
        banco.numeroConta = sc.nextInt();
        System.out.printf("/nDigite o seu nome: ");
        banco.nome = sc.nextLine();
        System.out.printf("Deseja fazer um depósito (s/n)? ");
        

        System.out.println("Dados da conta: ");
        System.out.println("Conta " + banco.numeroConta + ", Dono: " + banco.nome + ", Balanço: $" + banco.valor);

        System.out.println("Digite um valor de depósito: ");
        banco.valorDeposito = sc.nextDouble();

        System.out.println("Dados atualizados da conta: ");
        System.out.println("Conta " + banco.numeroConta + ", Dono: " + banco.nome + ", Balanço: $" + banco.valor);

        System.out.println("Digite um valor de saque: ");
        banco.valorSaque = sc.nextDouble();

        System.out.println("Dados atualizados da conta: ");
        System.out.println("Conta " + banco.numeroConta + ", Dono: " + banco.nome + ", Balanço: $" + banco.valor);
        sc.close();
    }
}
