package exercicio27;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double salarioMin = 1621.00;

        System.out.print("Digite seu salário: ");
        Double salario = sc.nextDouble();

        double quantidadeSalarios = salario / salarioMin;
        System.out.printf("Quantidade de salários minimos: %.2f", quantidadeSalarios);
        sc.close();
    }
}
