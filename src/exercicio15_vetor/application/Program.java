package exercicio15_vetor.application;

import java.util.Locale;
import java.util.Scanner;
import exercicio15_vetor.entities.Person;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] pessoa = new Person[n];

        for (int i=0;i<pessoa.length;i++){
            pessoa[i] = new Person();
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.println("Nome: ");
            pessoa[i].nome = sc.nextLine();
            System.out.println("Idade: ");
            pessoa[i].idade = sc.nextInt();
            sc.nextLine();
        }

        int posicao = 0;

        for (int i=0;i<pessoa.length;i++) {
            if (pessoa[i].idade > pessoa[posicao].idade) {
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s, %d anos%n", pessoa[posicao].nome, pessoa[posicao].idade);
        sc.close();
    }
}
