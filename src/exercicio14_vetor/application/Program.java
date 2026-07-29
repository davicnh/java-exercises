package exercicio14_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma = 0.0;
        int cont = 0;

        double[] vetor = new double[n];

        for(int i=0;i<vetor.length;i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                cont++;
            }
        }

        double avg = soma / cont;
        if (avg > 0) {
            System.out.printf("Média dos pares: %.2f%n", avg);
        } else {
            System.out.println("Nenhum número par.");
        }
        sc.close();
    }
}
