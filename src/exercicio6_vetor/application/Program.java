package exercicio6_vetor.application;
import java.util.Scanner;
import exercicio6_vetor.entitites.Product;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] produto = new Product[n]; 

        for (int i=0;i<produto.length;i++){
            String name = sc.nextLine();
            double price = sc.nextDouble();
            produto[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int y=0;y<produto.length;y++){
            sum += produto[y].getPrice();
        }

        double avg = sum / n;
        System.out.printf("Média: %.2f%n", avg);
        sc.close();
    }
}
