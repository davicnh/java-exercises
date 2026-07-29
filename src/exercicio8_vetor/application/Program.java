package exercicio8_vetor.application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vetor = new double[n];

        double sum = 0.0;

        for (int i=0;i<vetor.length;i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
            sum += vetor[i];
        }

        for(int i=0;i<vetor.length;i++){
            System.out.printf("Valores = %.2f ", vetor[i]);
        }

        double avg = sum / vetor.length;

        System.out.printf("Soma: %.2f%n", sum);
        System.out.printf("Média: %.2f%n", avg);
        
        sc.close();
    }
    
}
