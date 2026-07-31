package exercicio20_polimorfismo.application;

import exercicio20_polimorfismo.entities.ImportedProduct;
import exercicio20_polimorfismo.entities.Product;
import exercicio20_polimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<Product>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char letra = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (letra == 'c') {
                Product p1 = new Product(name, price);
                list.add(p1);
            } else if (letra == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product p2 = new UsedProduct(name, price, date);
                list.add(p2);
            } else if (letra == 'i') {
                System.out.println("Customs fee: ");
                double custom = sc.nextDouble();
                Product p3 = new ImportedProduct(name, price, custom);
                list.add(p3);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
