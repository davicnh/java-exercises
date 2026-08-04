package exercicio1.application;

import exercicio1.entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Digite os valores de largura e altura: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println("Área: " + retangulo.area());
        System.out.println("Perímetro: " + retangulo.perimeter());
        System.out.println("Diagonal: " + retangulo.diagonal());

        sc.close();
    }
}
