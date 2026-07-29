package exercicio11_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0;i<vetor.length;i++) {
            System.out.printf("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int posicao = 0;

        for (int y=0;y<vetor.length;y++) {
            if (vetor[y] > maior) {
                maior = vetor[y];
                posicao = y;
            }
        }

        System.out.printf("Maior valor: %d%n", maior);
        System.out.printf("Posição do maior valor: %d%n", posicao);
        sc.close();
    }
}
