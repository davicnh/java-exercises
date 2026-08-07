package exercicio34.application;

import exercicio34.entities.Pagamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do produto: ");
        Double valor = sc.nextDouble();
        sc.nextLine();
        Pagamento pagamento = new Pagamento(valor);

        System.out.println("Digite o método de pagamento: ");
        String metodo = sc.nextLine();

        System.out.println("Valor final: " + pagamento.tipo(metodo));
        sc.close();
    }
}
