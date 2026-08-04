package exercicio29;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        boolean valor1 = sc.nextBoolean();
        System.out.print("Digite o segundo valor: ");
        boolean valor2 = sc.nextBoolean();

        if (valor1 == true && valor2 == true) {
            System.out.println("Ambos são verdadeiros.");
        } else if (valor1 == false && valor2 == false) {
            System.out.println("Ambos são falsos.");
        } else {
            System.out.println("São diferentes.");
        }
        sc.close();
    }
}
