package exercicio28;

import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("Digite um valor: ");
         Double valor = sc.nextDouble();

         Double reajuste = valor * 1.05;

         System.out.println("Valor com reajuste de 5%: " + reajuste);
         sc.close();
    }
}
