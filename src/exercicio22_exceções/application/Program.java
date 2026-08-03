package exercicio22_exceções.application;

import exercicio22_exceções.entities.Account;
import exercicio22_exceções.exceptions.BusinessExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter account data: ");
         System.out.print("Number: ");
         int number = sc.nextInt();
         System.out.print("Holder: ");
         sc.next();
         String holder = sc.nextLine();
         System.out.print("Initial Balance: ");
         double initalBalance = sc.nextDouble();
         System.out.print("Withdraw limit: ");
         double limit = sc.nextDouble();

         Account account = new Account(initalBalance, holder, number, limit);

         System.out.println();
         System.out.print("Enter amount for withdraw: ");
         double amount = sc.nextDouble();

         try {
             account.withdraw(amount);
             System.out.printf("New balance: %.2f%n", account.getBalance());
         }
         catch (BusinessExceptions e) {
             System.out.println(e.getMessage());
         }
         sc.close();
    }
}
