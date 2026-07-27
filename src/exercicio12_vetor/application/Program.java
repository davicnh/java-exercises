package exercicio12_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] vetor3 = new int[n];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i=0;i<vetor1.length;i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for (int i=0;i<vetor2.length;i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i=0;i<vetor3.length;i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.printf("%d%n", vetor3[i]);
        }
        
        sc.close();
    }
}
