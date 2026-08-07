package exercicio35.application;

import exercicio35.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        Integer idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        String maioridade = pessoa.retorno();

        System.out.println("Resultado: " + maioridade);

        sc.close();
    }
}
