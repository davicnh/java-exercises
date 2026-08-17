package exercicio45_set.application;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for class A? ");
        int numA = sc.nextInt();

        for (int i=0;i<numA;i++){
            int alunosA = sc.nextInt();
            set.add(alunosA);
         }

        System.out.print("How many students for class B? ");
        int numB = sc.nextInt();

        for (int i=0;i<numB;i++){
                int alunosB = sc.nextInt();
                set.add(alunosB);
            }

        System.out.print("How many students for class C? ");
        int numC = sc.nextInt();

        for (int i=0;i<numC;i++){
                int alunosC = sc.nextInt();
                set.add(alunosC);
            }

        System.out.println("Total students of Alex: " + set.size());
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
