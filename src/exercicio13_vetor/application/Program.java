package exercicio13_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vetor = new double[n];

        double soma = 0;

        for (int i=0;i<vetor.length;i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double avg = soma / vetor.length;
        System.out.printf("Média do vetor: %.2f%n", avg);

        System.out.println("Elementos abaixo da média: ");
        for (int i=0;i<vetor.length;i++){
            if (vetor[i] < avg) {
                System.out.printf("%.2f%n", vetor[i]);
            }
        }
        sc.close();
    }
}
