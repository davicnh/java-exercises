package exercicio25;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer c = 0;

        System.out.print("Digite o primeiro número: ");
        Integer a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        Integer b = sc.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("Soma dos números: " + c);
        } else {
            c = a * b;
            System.out.println("Multiplicação dos números: " + c);
        }

        sc.close();
    }
}
