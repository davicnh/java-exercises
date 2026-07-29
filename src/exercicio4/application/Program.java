package exercicio4.application;

import java.util.Locale;
import java.util.Scanner;
import exercicio4.entities.Dolar;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dolar = sc.nextDouble();

        System.out.printf("\nHow many dollars will be bought?");
        double quant = sc.nextDouble();

        double total = Dolar.currencyConverter(dolar, quant);

        System.out.printf("\nAmount to be paid in reais: %.2f%n", total);

        sc.close();
    }
}
