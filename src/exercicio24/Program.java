package exercicio24;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer num = sc.nextInt();

        String resultado;
        String resultado2;

        if (num % 2 == 0 && num >= 0) {
            resultado = "Par";
            resultado2 = "Positivo";
        } else if (num % 2 != 0 && num < 0) {
            resultado = "Ímpar";
            resultado2 = "Negativo";
        } else if (num % 2 == 0 && num < 0) {
            resultado = "Par";
            resultado2 = "Negativo";
        } else {
            resultado = "Ímpar";
            resultado2 = "Positivo";
        }

        System.out.println("Par ou Ímpar: " + resultado);
        System.out.println("Positivo ou negativo: " + resultado2);
        sc.close();
    }
}
