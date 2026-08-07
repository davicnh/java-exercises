package exercicio32.application;

import exercicio32.entitites.Media;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        Double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        Double n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        Double n3 = sc.nextDouble();

        Media media = new Media(name, n1, n2, n3);

        Double notaFinal = media.calculo();

        System.out.println("Nome do ALuno: " + media.getName());
        System.out.printf("Nota final: %.2f", notaFinal);
        sc.close();
    }
}
