package exercicio3.application;

import java.util.Locale;
import java.util.Scanner;
import exercicio3.entities.Student;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Nome do aluno: ");
        student.name = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        student.n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        student.n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        student.n3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() > 60.0) {
            System.out.println("PASS");
        } else if (student.finalGrade() < 60) {
            System.out.println("Failed");
            System.out.printf("Missing points: %.2f", student.missingPoints());
        }

        sc.close();
    }
    
}
