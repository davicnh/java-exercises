package exercicio33.application;

import exercicio33.entities.Media;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Primeira nota: ");
        Double n1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        Double n2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        Double n3 = sc.nextDouble();
        System.out.print("Quarta nota: ");
        Double n4 = sc.nextDouble();

        Media media = new Media(n1, n2, n3, n4, name);

        System.out.println("Nota final: " + media.calcularMedia());
        System.out.println("Resultado: " + media.resultado());

        sc.close();
    }
}
