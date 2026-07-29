package exercicio18_pensionato.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio18_pensionato.entities.Person;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Person[] rooms = new Person[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Person(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0;i<10;i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
        sc.close();
    }
}
