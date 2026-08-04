package exercicio23;

import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("Digite o valor A: ");
         Integer a = sc.nextInt();
         System.out.print("Digite o valor B: ");
         Integer b = sc.nextInt();

         Integer soma = a + b;

         System.out.print("Digite o valor C: ");
         Integer c = sc.nextInt();

         boolean calculo;
         if (soma < c) {
             calculo = true;
         } else {
             calculo = false;
         }

         System.out.println("A soma entre A e B é menor que C? " + calculo);
         sc.close();
    }
}
