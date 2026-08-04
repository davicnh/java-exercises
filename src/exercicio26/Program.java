package exercicio26;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        Integer num = scanner.nextInt();

        System.out.printf("Antecessor: %d%n", num - 1);
        System.out.printf("Sucessor: %d%n", num + 1);
        scanner.close();
    }
}
