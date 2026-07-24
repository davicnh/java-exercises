package exercicio9_vetor.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio9_vetor.entities.Person;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Person[] pessoa = new Person[n];

        double sum = 0.0;
        int cont = 0;

        for (int i=0;i<pessoa.length;i++){
            
            pessoa[i] = new Person();

            pessoa[i].name = sc.nextLine();
            pessoa[i].age = sc.nextInt();
            pessoa[i].height = sc.nextDouble();
            sc.nextLine();
        }

        for(int i=0;i<pessoa.length;i++){
            sum += pessoa[i].height;

            if(pessoa[i].age < 16) {
                System.out.println(pessoa[i].name);
                cont++;
            }
        }

        double avg = sum / pessoa.length;
        double por = (double) cont / pessoa.length * 100.0;
        
        System.out.printf("Altura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", por);
        
        sc.close();
    }
}
