package exercicio30;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Leia o primeiro valor: ");
        Integer a = sc.nextInt();
        System.out.print("Leia o segundo valor: ");
        Integer b = sc.nextInt();
        System.out.print("Leia o terceiro valor: ");
        Integer c = sc.nextInt();

        int maior = 0, menor = 0, meio = 0;

        if (a > b && a > c) {
            a = maior;
        } else if (b > c) {
            b = maior;
        } else {
            maior = c;
        }
    }
   }