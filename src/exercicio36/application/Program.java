package exercicio36.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor A: ");
        Integer n1 = sc.nextInt();

        System.out.print("Digite o valor B: ");
        Integer n2 = sc.nextInt();


        System.out.println("Valor A: " + n2);
        System.out.println("Valor B: " + n1);
        sc.close();
    }

}
