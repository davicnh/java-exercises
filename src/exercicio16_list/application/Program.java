package exercicio16_list.application;

import java.util.Locale;
import java.util.Scanner;
import exercicio16_list.entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Employee[] employees = new Employee[n];
        
        for (int i=0;i<employees.length;i++) {
            employees[i] = new Employee();
            System.out.println("Id: ");
            employees[i].id = sc.nextInt();
            System.out.println("Name: ");
            employees[i].name = sc.next();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            employees[i].setSalary(salary);
        }

        System.out.println("Enter the employee id that will have a increase: ");
        int id = sc.nextInt();
        System.out.println("Enter the percentage: ");
        double percentage = sc.nextDouble();

        boolean found = false;

        for (int i=0;i<employees.length;i++){
            if (id == employees[i].id) {
                employees[i].incraseSalary(percentage);
                found = true;
            } 
        }

        if (!found) {
            System.out.println("ID not found.");
        }

        System.out.println("List of employees: ");
        for (int i=0;i<employees.length;i++) {
            System.out.println(employees[i].id + ", " + employees[i].name + ", " + employees[i].getSalary());
        }

        sc.close();
    }
}