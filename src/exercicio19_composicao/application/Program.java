package exercicio19_composicao.application;

import exercicio19_composicao.entities.Client;
import exercicio19_composicao.entities.Order;
import exercicio19_composicao.entities.OrderItem;
import exercicio19_composicao.entities.enums.OrderStatus;
import exercicio19_composicao.entities.Product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.next();
        System.out.printf("Birth date (DD/MM/YYYY) : ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        Client client = new Client(name, email, data);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order(client, new Date(), status);

        for (int i=0;i<n;i++) {
            System.out.println("Enter #" + (1+i) + "item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productPrice, quantity, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
