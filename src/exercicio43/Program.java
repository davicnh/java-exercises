package exercicio43;

import java.util.Scanner;

public class Program {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int quociente = a / b;
        int resto = a % b;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
        sc.close();
    }
}
