package exercicio41;

import java.util.Scanner;

public class Program {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int num = sc.nextInt();

        for (int i=1;i<=10;i++) {
            System.out.println("Resultado de " + num + "x" + i + ": " + num * i);
        }
        sc.close();
    }
}
