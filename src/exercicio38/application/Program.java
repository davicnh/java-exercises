package exercicio38.application;

import exercicio38.entites.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = sc.nextDouble();
        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = sc.nextDouble();
        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = sc.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        String resultado = triangulo.calcular();

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
