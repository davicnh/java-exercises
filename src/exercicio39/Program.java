package exercicio39;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        Double tempF = sc.nextDouble();

        Double celcius = (5 * (tempF - 32) / 9);

        System.out.println("Temperatura em Fahrenheit: " + tempF);
        System.out.println(String.format("Temperatura em Celcius: %.2f", celcius));
        sc.close();
    }
}
