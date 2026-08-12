package exercicio44_interface.application;

import exercicio44_interface.entities.Contract;
import exercicio44_interface.entities.Installment;
import exercicio44_interface.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data: ");
        LocalDate data = LocalDate.parse(sc.next(), formatter);
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(data, number, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        Integer parcelas = sc.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
