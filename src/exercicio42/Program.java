package exercicio42;

import java.util.Random;

public class Program {
    static void main(String[] args){

        Random numero = new Random();

        int num = numero.nextInt(101);

        System.out.println("Número Aleatório: " + num);
    }
}
