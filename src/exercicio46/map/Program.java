package exercicio46.map;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String nome = parts[0];
                int votos = Integer.parseInt(parts[1]);

                if (map.containsKey(nome)) {
                    int votosAtuais = map.get(nome);
                    map.put(nome, votosAtuais + votos);
                } else {
                    map.put(nome, votos);
                }
            }
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
 }
}
