package exercicio21_abstração.application;

import exercicio21_abstração.entities.Pessoa;
import exercicio21_abstração.entities.PessoaFisica;
import exercicio21_abstração.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        double sum = 0.00;
        for (int i=1;i<=n;i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char letra = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (letra == 'i') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                Pessoa p1 = new PessoaFisica(name, rendaAnual, gastosSaude);
                list.add(p1);
                sum += p1.imposto();
            } else if (letra == 'c') {
                System.out.print("Number of employees: ");
                int num = sc.nextInt();
                Pessoa p2 = new PessoaJuridica(name, rendaAnual, num);
                list.add(p2);
                sum += p2.imposto();
            }
        }

        System.out.println("Taxes paid:");
        for (Pessoa pessoa : list) {
            System.out.println(pessoa.getNome() + ": R$" + pessoa.imposto());
        }

        System.out.println("Total taxes: " + sum);
        sc.close();
    }
}
