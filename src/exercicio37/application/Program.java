package exercicio37.application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o ano que nasceu: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int anosVividos = anoAtual - anoNascimento;

        int totalDias = anosVividos * 365;

        int anos = totalDias / 365;

        int diasRestantes = totalDias % 365;

        int meses = diasRestantes / 30;

        int dias = diasRestantes % 30;

        System.out.println("Você viveu " + anos + " anos, " + meses + " meses, " + dias + " dias.");
        sc.close();
    }
}
