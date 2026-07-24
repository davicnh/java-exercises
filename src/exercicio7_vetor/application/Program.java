package exercicio7_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0;i<vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números Negativos: ");
        for (int i=0;i<vetor.length;i++) {
            if (vetor[i]<0){
                System.out.printf("%d%n", vetor[i]);
            }
        }
        sc.close();
    }
}
